package us.icarenow.web.model.entity;


import javax.persistence.*;

@Entity
@Table(name="icn_patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int userId;

    private String cnp;

    private String firstName;

    private String lastName;

    private byte insured;

    public Patient() {
    }

    public Patient(int userId, String cnp, String firstName, String lastName, byte insured) {
        this.userId = userId;
        this.cnp = cnp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.insured = insured;
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

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
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

    public byte getInsured() {
        return insured;
    }

    public void setInsured(byte insured) {
        this.insured = insured;
    }
}
