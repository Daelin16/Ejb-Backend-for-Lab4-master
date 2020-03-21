package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
//@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users")
public class User {
    @Id
    private String username;

    private String passwordHash;

    private String authToken;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public User(String username, String passwordHash, String authToken) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.authToken = authToken;
    }
}
