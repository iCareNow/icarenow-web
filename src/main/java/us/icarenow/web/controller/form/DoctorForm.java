package us.icarenow.web.controller.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class DoctorForm {

    @Size(min = 3, max = 25)
    private String firstName;

    @Size(min = 3, max = 25)
    private String lastName;

    @Email
    private String email;

    @Size(min = 6, max = 25)
    private String password;

    private String specialty;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "AddDoctorForm{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
