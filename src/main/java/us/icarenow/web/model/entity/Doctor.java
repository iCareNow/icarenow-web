package us.icarenow.web.model.entity;


import javax.persistence.*;

@Entity
@Table(name = "icn_doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private long userId;

    private String firstName;

    private String lastName;

    public Doctor() {
    }

//    public Doctor(int userId, String firstName, String lastName, S) {
//        this.userId = userId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

    public Doctor(long userId, String firstName, String lastName) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getUserId() {
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

}
