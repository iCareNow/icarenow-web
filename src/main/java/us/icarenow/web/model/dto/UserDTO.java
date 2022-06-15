package us.icarenow.web.model.dto;

import us.icarenow.web.model.entity.Role;

import java.util.List;

public class UserDTO {

    private String email;

    private byte status;

    private List<Role> roles;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
