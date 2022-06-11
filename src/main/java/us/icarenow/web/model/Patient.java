package us.icarenow.web.model;


import javax.persistence.*;

@Entity
@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="CNP")
    private String CNP;

    @Column(name="name")
    private String name;


    @Column(name="insured")
    private boolean insured;

    public Patient() {
    }

    public Patient(String CNP, String name){
        this.id = id;
        this.CNP = CNP;
        this.name = name;
        this.insured = insured;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInsured() {
        return insured;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }
}
