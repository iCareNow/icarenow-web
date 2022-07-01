package us.icarenow.web.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.icarenow.web.controller.form.AppointmentForm;
import us.icarenow.web.model.entity.Appointment;
import us.icarenow.web.repository.AppointmentRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Appointment createAppointment (AppointmentForm appointmentForm) {

        Appointment appointment = new Appointment(appointmentForm.getFullName(), appointmentForm.getEmail(), appointmentForm.getAppointDate(),
                        appointmentForm.getStartTime(), appointmentForm.getEndTime(), appointmentForm.getTelNumber(), appointmentForm.getInjury());

        return appointmentRepository.save(appointment);

    }

    public void deleteAppointment(int id)
    {
        appointmentRepository.deleteById(id);
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll()
                .stream()
                .map(appointment -> modelMapper.map(appointment, Appointment.class))
                .collect(Collectors.toList());
    }

}
