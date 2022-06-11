package us.icarenow.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import us.icarenow.web.model.Patient;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query("select p from Patient p where p.id= :id")
    List findAll();

    @Query("select p from Patient p where p.id= :id")
    List findById(@Param("id") int id);
}
