package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Points")
public class Point {
    private @Id
    @GeneratedValue
    Long id;
    private double x;
    private double y;
    private double r;
    private boolean result;

    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Point() {

    }

    public Point(long id, double x, double y, double r, boolean result, User user) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.r = r;
        this.result = result;
        this.user = user;
    }
}
