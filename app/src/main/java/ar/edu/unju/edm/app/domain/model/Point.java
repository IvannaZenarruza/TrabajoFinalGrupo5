package ar.edu.unju.edm.app.domain.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String URL;
    private String locate;
    private String name;
    private String description;
    private String type;
    private Float rating;
    
    public Point(Integer iD, String uRL, String locate, String name, String description, String type, Float rating,
            Boolean state) {
        ID = iD;
        URL = uRL;
        this.locate = locate;
        this.name = name;
        this.description = description;
        this.type = type;
        this.rating = rating;
        this.state = state;
    }
    private Boolean state;
    public Point (){
        
    }
    public Integer getID() {
        return ID;
    }
    public void setID(Integer iD) {
        ID = iD;
    }
    public String getURL() {
        return URL;
    }
    public void setURL(String uRL) {
        URL = uRL;
    }
    public String getLocate() {
        return locate;
    }
    public void setLocate(String locate) {
        this.locate = locate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Float getRating() {
        return rating;
    }
    public void setRating(Float rating) {
        this.rating = rating;
    }
    public Boolean getState() {
        return state;
    }
    public void setState(Boolean state) {
        this.state = state;
    }
}

