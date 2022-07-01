package us.icarenow.web.controller.form;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class AppointmentForm {

//    private long doctorId;

    @Size(min=3, max=40)
    private String fullName;

    @Email
    @Size(min=8, max=30)
    private String email;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate appointDate;

    @NotNull
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime startTime;

    @NotNull
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime endTime;

    @Pattern(regexp="^[0-9]{10}", message = "Telephone number invalid")
    private String telNumber;

    @Size(min=3, max=25)
    private String injury;

//    private List<String> doctors = Arrays.asList("Doctor1", "Doctor2");

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getAppointDate() {
        return appointDate;
    }

    public void setAppointDate(LocalDate appointDate) {
        this.appointDate = appointDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getInjury() {
        return injury;
    }

    public void setInjury(String injury) {
        this.injury = injury;
    }

//    public List<String> getDoctors() {
//        return doctors;
//    }
//
//    public void setDoctors(List<String> doctors) {
//        this.doctors = doctors;
//    }
//
//    public long getDoctorId() {
//        return doctorId;
//    }
//
//    public void setDoctorId(long doctorId) {
//        this.doctorId = doctorId;
//    }
}
