package us.icarenow.web.model;


import javax.persistence.*;

@Entity
@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="CNP")
    private int CNP;

    @Column(name="name")
    private String name;

    @Column(name="insured")
    private boolean insured;

    public Patient() {
    }

    public Patient(int id, String name, boolean insured){
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

    public int getCNP() {
        return CNP;
    }

    public void setCNP(int CNP) {
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
