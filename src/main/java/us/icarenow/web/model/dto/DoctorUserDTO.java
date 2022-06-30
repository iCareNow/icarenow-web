package us.icarenow.web.model.dto;

public class DoctorUserDTO {

    private String firstName;

    private String lastName;

    private String email;

    private String mergedSpecialties;

    public DoctorUserDTO() {
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

    public String getMergedSpecialties() {
        return mergedSpecialties;
    }

    public void setMergedSpecialties(String mergedSpecialties) {
        this.mergedSpecialties = mergedSpecialties;
    }
}
