package pl.niecikowski.portfolioapp.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.niecikowski.portfolioapp.app.entities.Experience;

@Repository
public interface ExperienceRepo extends CrudRepository<Experience, Long> {



}
