package us.icarenow.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import us.icarenow.web.model.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
