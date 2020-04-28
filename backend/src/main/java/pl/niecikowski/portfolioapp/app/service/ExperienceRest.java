package pl.niecikowski.portfolioapp.app.service;


import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.niecikowski.portfolioapp.app.repo.ExperienceRepo;
import pl.niecikowski.portfolioapp.app.entities.Experience;

import java.util.List;

@CrossOrigin
@RestController
public class ExperienceRest {

    ExperienceRepo experienceRepo;

    @Autowired
    public ExperienceRest(ExperienceRepo experienceRepo) {
        this.experienceRepo = experienceRepo;
    }


    @GetMapping("/api/all")
    List<Experience> all() {

        Iterable<Experience> experiences = experienceRepo.findAll();
        experiences.forEach(System.out::println);
        return (List<Experience>) experienceRepo.findAll();
    }

    @PostMapping("/experience")
    Experience addExperience(@RequestBody Experience experience) {
        return experienceRepo.save(experience);
    }


    // Single

    @GetMapping("/experience/{id}")
    Experience one(@PathVariable Long id) throws NotFoundException {

        return experienceRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
    }

    // Replace Experience
    @PostMapping("/experience/{id}")
    Experience replaceExperience(@RequestBody Experience newExperience, @PathVariable Long id) {

        return experienceRepo.findById(id)
                .map(experience -> {
                    experience.setName(newExperience.getName());
                    experience.setDescription(newExperience.getDescription());
                    return experienceRepo.save(experience);
                })
                    .orElseGet(() -> {
                       newExperience.setId(id);
                       return experienceRepo.save(newExperience);
                    });
    }

    @DeleteMapping("/experience/{id}")
    void deleteExperience(@PathVariable Long id) {
        experienceRepo.deleteById(id);
    }

}
