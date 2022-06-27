package us.icarenow.web.model.entity;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static us.icarenow.web.model.entity.UserStatus.*;


@Entity
@Table(name = "icn_user")
public class User implements UserDetails {

    private static final String ROLE_PREFIX = "ROLE_";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;

    private String pwd;

    private byte accountStatus;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name = "userId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "roleId", referencedColumnName = "id"))
    private List<Role> roles;

    public User() {
    }

    public User(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {    this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles.stream().map(role -> new SimpleGrantedAuthority(ROLE_PREFIX + role.getName())).collect(Collectors.toList());
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public String getPassword() {
        return pwd;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountStatus != EXPIRED.value();
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountStatus != LOCKED.value();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return accountStatus != EXPIRED.value();
    }

    @Override
    public boolean isEnabled() {
        return accountStatus == ACTIVE.value();
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public byte getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(byte accountStatus) {
        this.accountStatus = accountStatus;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
