package us.icarenow.web.service;

import us.icarenow.web.model.Patient;
import us.icarenow.web.repository.PatientRepository;

import java.util.List;


public class PatientService {
//    @Autowired
    private PatientRepository patientRepository;
    public void Patient (PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public List findAll() {
        return patientRepository.findAll();
    }

    public List findById(int id) {
        return patientRepository.findById(id);

    }


}
