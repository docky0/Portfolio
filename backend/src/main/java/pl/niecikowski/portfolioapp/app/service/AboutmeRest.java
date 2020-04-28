package pl.niecikowski.portfolioapp.app.service;


import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pl.niecikowski.portfolioapp.app.entities.Aboutme;
import pl.niecikowski.portfolioapp.app.repo.AboutmeRepo;
import sun.text.resources.FormatData;

@CrossOrigin
@RestController
public class AboutmeRest {

    AboutmeRepo aboutmeRepo;

    @Autowired
    public AboutmeRest(AboutmeRepo aboutmeRepo) {
        this.aboutmeRepo = aboutmeRepo;
    }


    // Single

    @GetMapping("/api/aboutme")
    Aboutme getAboutMe() throws NotFoundException {

        return aboutmeRepo.findById((long) 1)
                .orElseThrow(() -> new NotFoundException("ID not found"));
    }

    // Replace Experience
    @PostMapping("/api/aboutme")
    Aboutme addAboutMe(@ModelAttribute Aboutme newaboutme) {

        Aboutme ab = new Aboutme(1, newaboutme.getDesc());
        try {
            return aboutmeRepo.findById((long) 1)
                    .map(aboutme -> {
                        aboutme.setDesc(newaboutme.getDesc());
                        return aboutmeRepo.save(aboutme);
                    })
                    .orElseGet(() -> {
                        newaboutme.setId(1);
                        return aboutmeRepo.save(newaboutme);
                    });
        } catch (Exception ex){
            return aboutmeRepo.save(ab);
        }
    }

}
