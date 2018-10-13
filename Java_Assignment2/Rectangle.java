package com.company;
import java.awt.*;

public class Rectangle extends Shape {
    private int height, width;

    public Rectangle(int x, int y, Color color, int height, int width) {
        super(x,y, color);
        this.height = height;
        this.width = width;
        setX(x);
        setY(y);
        setColor(color);
    }

    //Setters and Getters, Override function due to similar method names
    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.height = height;
    }

    //Rectangle area
    @Override
    public double getArea() {
        return height * width;
    }

    //Rectangle Perimeter
    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    //shifts by deltax, deltay from origin
    @Override
    public void moveTo() {
        x += dx;
        y += dy;
    }

    //returns origin values (0,0)
    @Override
    public Point getPoint(){
        return new Point(x,y);
    }

    //distance from origin to a point
    @Override
    public double distanceTo() {
        double dx = width  - this.x;
        double dy = height - this.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    //rectangle draw method
    @Override
    public void draw(Graphics g){
        Rectangle rect = new Rectangle(x,y, Color.BLUE, height, width);
        g.setColor(getColor());
        g.fillRect(getx(),gety(),getHeight(),getWidth());
    }
}
