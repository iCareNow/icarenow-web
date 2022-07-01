package us.icarenow.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import us.icarenow.web.controller.form.AppointmentForm;
import us.icarenow.web.repository.AppointmentRepository;
import us.icarenow.web.service.AppointmentService;

import javax.validation.Valid;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private AppointmentRepository appointmentRepository;

//    @GetMapping
//    public ModelAndView appointmentView () {
//        return new ModelAndView("appointments", "appointmentForm", new AppointmentForm());
//    }

    @PostMapping
    public String createAppointmentAction (@Valid @ModelAttribute("appointmentForm") AppointmentForm appointmentForm, BindingResult result, ModelMap map) {
        if (result.hasErrors()) {
            return "appointments";
        }

        appointmentService.createAppointment(appointmentForm);
        return "redirect:/appointments";
    }

    @GetMapping
    public ModelAndView appointmentView() {
        ModelAndView appointmentListMV = new ModelAndView("appointments", "appointmentForm", new AppointmentForm());
        appointmentListMV.addObject("appointmentList", appointmentService.getAllAppointments());
        return appointmentListMV;
    }

    @GetMapping("/deleteAppointment/{id}")
    public String deleteAppointment(@PathVariable(value = "id") int id) {
        appointmentService.deleteAppointment(id);
        return "redirect:/appointments";

    }





}
