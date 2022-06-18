package us.icarenow.web.controller.form;

public class SignUpPatientForm {

    //    TODO @Pattern(regexp = "//d{13}", message = "CNP invalid")
    private String cnp;

    //    TODO  @Email(message = "Email invalid")
    private String email;

    //    TODO @Min(6)
//    TODO @Max(30)
    private String password;

    //    TODO @Min(4)
//    TODO @Max(30)
    private String firstName;

    //    TODO @Min(4)
//    TODO  @Max(30)
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
