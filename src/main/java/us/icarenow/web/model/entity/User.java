package us.icarenow.web.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="icn_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    private String password;
//    TODO @ManyToMany
    // TODO d legat tabela de role
//   TODO private List<Role> role;

//    TODO @ManyToMany
    // TODO de legat de tabela role
//   TODO private List<Role> roles;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

//  TODO  public List<Role> getRoles() {
//        return roles;
//    }
//
//   TODO public void setRoles(List<Role> roles) {
//        this.roles = roles;
//    }
}
