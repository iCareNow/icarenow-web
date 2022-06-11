package us.icarenow.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import us.icarenow.web.service.PatientService;

import java.util.List;


@Controller
public class PatientController {

    private PatientService patientService;



//    @RequestMapping("patient/add")
//    public String addPatient(@RequestParam("CNP") String CNP, @RequestParam("nume") String nume){
//        return patientService.addPatient(new Patient(CNP,nume));
//    }

    @RequestMapping("patient/showAll")
    public List findAllPatients() {
        return patientService.findAll();
    }
    @RequestMapping("patient/{id}")
    public List findById(@PathVariable("id") Integer id){
        return patientService.findById(id);

    }

}
