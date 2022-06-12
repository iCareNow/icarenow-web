package us.icarenow.web.model;


import javax.persistence.*;

@Entity
//@Table(name="patients")
public class Patient {


//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    @Column(name="id")
    private int id;

    @Column(name="cnp")
    private String cnp;

    @Column(name="name")
    private String name;


    @Column(name="insured")
    private boolean insured;

    public Patient() {
    }

    public Patient(String cnp, String name){
//        this.id = id;
        this.cnp = cnp;
        this.name = name;
//        this.insured = insured;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCNP() {
        return cnp;
    }

    public void setCNP(String CNP) {
        this.cnp = CNP;
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
