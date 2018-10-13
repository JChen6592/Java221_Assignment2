package com.company;
import java.awt.*;

public class Circle extends Oval{
    private int radius;

    public Circle(int x, int y, Color color, int width, int height, int r){
        super(x,y,color, width, height);
        this.radius = r;
        setX(x);
        setY(y);
        setColor(color);
    }

    //Setters and Getters
    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    //Return Circle Area
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Return Circle Perimeter
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //Return origin point (0,0)
    @Override
    public Point getPoint(){
        return new Point(x,y);
    }

    //shift from origin by deltax, deltay
    @Override
    public void moveTo(){
        x += dx;
        y += dy;
    }

    //shortest distance from origin to point on circle
    @Override
    public double distanceTo(){
        double dx = Math.pow(this.x - width,2);
        double dy = Math.pow(this.y - height,2);
        return Math.sqrt((dx*dx) + (dy*dy)) - radius;
    }

    //Circle draw method
    @Override
    public void draw(Graphics g){
        g.setColor(getColor());
        g.fillOval( getx()-getRadius(), gety()-getRadius() ,getRadius() * 2, getRadius() * 2);

    }
}
