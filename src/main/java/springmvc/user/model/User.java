package springmvc.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(unique = true)
    private String userName;

    private String password;

    private String role;

    // e.g., "ROLE_USER" or "ROLE_ADMIN"


    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
