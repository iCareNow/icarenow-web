package us.icarenow.web.controller.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class SignUpPatientForm {

//    @Pattern(regexp = "//d{13}", message = "CNP invalid")
    private String cnp;

//    @Email(message = "Email invalid")
    private String email;

//    @Min(6)
//    @Max(30)
    private String password;

//    @Min(4)
//    @Max(30)
    private String firstName;

//    @Min(4)
//    @Max(30)
    private String lastName;

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

    @Override
    public String toString() {
        return "SignUpPatientForm{" +
                "cnp='" + cnp + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
