package us.icarenow.web.model.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "icn_doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long userId;

    private String firstName;

    private String lastName;

//    private String mergedSpecialties;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name = "doctorId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "specialtyId", referencedColumnName = "id"))
    private List<Specialty> specialty;

    public Doctor() {
    }

    public Doctor(long userId, String firstName, String lastName) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
//        this.specialty=getSpecialty();
    }

    public long getId() {
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

    public List<Specialty> getSpecialty() {
        return specialty;
    }

    public void setSpecialty(List<Specialty> specialty) {
        this.specialty = specialty;
    }
    @Override
    public String toString() {
        return "Doctor{" +
                "specialty=" + specialty +
                '}';
    }

   }
