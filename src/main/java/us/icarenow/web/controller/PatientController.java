package us.icarenow.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import us.icarenow.web.model.Patient;
import us.icarenow.web.repository.PatientRepository;

import java.util.List;

//@RequestMapping("/test")
@Controller
@RestController
public class PatientController {

//    private PatientService patientService;
/*
test
 */
    private PatientRepository patientRepository;
    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;

    }
    /*
test
 */


//    @RequestMapping("patient/add")
//    public String addPatient(@RequestParam("CNP") String CNP, @RequestParam("nume") String nume){
//        return patientService.addPatient(new Patient(CNP,nume));
//    }

//    @RequestMapping("patient/showAll")
//    public List findAllPatients() {
//        return patientService.findAll();
//    }
//    @RequestMapping("patient/{id}")
//    public List findById(@PathVariable("id") Integer id){
//        return patientService.findById(id);
//
//    }
    @GetMapping("patients")
    public List<Patient> findAll() {
    return patientRepository.findAll();
}
    @RequestMapping("patient/{id}")
    public List<Patient> findById(@PathVariable("id") Integer id){
        return patientRepository.findById(id);

    }

}
