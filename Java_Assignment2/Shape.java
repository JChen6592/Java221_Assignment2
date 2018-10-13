package com.company;
import java.awt.*;

public abstract class Shape extends Canvas implements ShapeInterface, PositionInterface {
    public int x, y, dx, dy;
    private Color color;

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    //Setters and Getters
    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public int getdx() {
        return dx;
    }

    public int getdy() {
        return dy;
    }

    public Color getColor() {
        return color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setdx(){
        this.dx = dx;
    }

    public void setdy(){
        this.dy = dy;
    }

    //Setting interface methods as abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract Point getPoint();
    public abstract void moveTo();
    public abstract double distanceTo();
    public abstract void draw(Graphics g);
}
