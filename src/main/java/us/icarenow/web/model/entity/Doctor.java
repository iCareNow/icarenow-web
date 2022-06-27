package us.icarenow.web.model.entity;


import javax.persistence.*;

@Entity
@Table(name="icn_doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int userId;

    private String firstName;

    private String lastName;

    private String specialty;




    public Doctor() {
    }

    public Doctor(int userId, String firstName, String lastName, String specialty) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() { return specialty; }

    public void setSpecialty(String specialty) { this.specialty = specialty; }
}
