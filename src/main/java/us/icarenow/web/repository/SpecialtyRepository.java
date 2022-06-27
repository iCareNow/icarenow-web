package us.icarenow.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import us.icarenow.web.model.entity.Specialty;

public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {
}
