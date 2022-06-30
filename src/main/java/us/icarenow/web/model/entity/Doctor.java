package us.icarenow.web.model.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "icn_doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private long userId;

    private String firstName;

    private String lastName;

//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(joinColumns = @JoinColumn(name = "doctorId", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "specialtyId", referencedColumnName = "id"))
//    private List<Specialty> specialties;

    public Doctor() {
    }

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

//    public List<Specialty> getSpecialties() {
//        return specialties;
//    }
//
//    public void setSpecialties(List<Specialty> specialties) {
//        this.specialties = specialties;
//    }
}
