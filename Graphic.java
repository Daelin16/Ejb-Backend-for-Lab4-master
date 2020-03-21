package model;

import entities.Point;

import javax.ejb.Stateless;

@Stateless
public class Graphic {
    public boolean isInArea(double x, double y, double r) {
        boolean triangle = x <= 0 && x >= -r / 2 && y >= 0 && y <= r && y <= 2 * x + r;
        boolean square = x >= 0 && y >= 0 && x <= r && y <= r/2;
        boolean sector = y <= 0 && x <= 0 && x >= -r && y >= -r && x * x + y * y <= r * r;
        return triangle || square || sector;
    }

    public boolean isInArea(Point point) {
        return isInArea(point.getX(), point.getY(), point.getR());
    }

}
