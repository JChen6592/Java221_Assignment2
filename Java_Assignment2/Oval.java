package com.company;
import java.awt.*;

public class Oval extends Shape {
    public int width, height;
    private Color color;

    public Oval (int x, int y, Color color, int width, int height){
        super(x,y, color);
        this.width = width;
        this.height = height;
        setX(x);
        setY(y);
        setColor(color);
    }

    //Setters and Getters
    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //return area of ellipse
    @Override
    public double getArea(){
        return Math.PI * width * height;
    }

    //return perimeter of ellipse
    @Override
    public double getPerimeter(){
        return 2 * Math.sqrt((Math.pow(width,2) + (Math.pow(height,2)))/ 2);
    }

    //return origin point (0,0)
    @Override
    public Point getPoint(){
        return new Point(x,y);
    }

    //shift ellipse from origin point by deltax, deltay
    @Override
    public void moveTo(){
        x += dx;
        y += dy;
    }

    //distance
    @Override
    public double distanceTo() {
        double dx = width - this.x;
        double dy = height - this.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    //ellipse draw method
    @Override
    public void draw(Graphics g){
        g.setColor(getColor());
        g.fillOval(getx(),gety(),getWidth(),getHeight());
    }
}
