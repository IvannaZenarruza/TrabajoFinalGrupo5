package ar.edu.unju.edm.app.domain.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String email;
    private String password;
    private String nationality;
    private Boolean state;

    public User(String email, String password, Integer ID, String nationality, Boolean state) {
        this.email = email;
        this.password = password;
        this.ID = ID;
        this.nationality = nationality;
        this.state = state;
    }
    public User(){

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
    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public boolean isState() {
        return state;
    }
    public void setState(Boolean state) {
        this.state = state;
    }
    
}
