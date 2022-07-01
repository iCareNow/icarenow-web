package us.icarenow.web.model.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "icn_appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String fullName;

    private String email;

    private LocalDate appointDate;

    private LocalTime startTime;

    private LocalTime endTime;

    private String telNumber;

    private String injury;

    public Appointment() {

    }

    public Appointment(String fullName, String email, LocalDate appointDate, LocalTime startTime, LocalTime endTime, String telNumber, String injury) {
        this.fullName = fullName;
        this.email = email;
        this.appointDate = appointDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.telNumber = telNumber;
        this.injury = injury;
    }

    public int getId() {
        return id;
    }

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
}
