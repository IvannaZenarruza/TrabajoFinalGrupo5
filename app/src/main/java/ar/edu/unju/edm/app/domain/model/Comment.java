package ar.edu.unju.edm.app.domain.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
public class Comment {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uid")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pid")
    private Point point;
    private String comment;
    public Comment() {}

    public Comment(Integer ID, User user, Point point, String comment) {
        this.ID = ID;
        this.user = user;
        this.point = point;
        this.comment = comment;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}