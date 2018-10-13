package com.company;
import java.awt.*;
import javax.swing.*;

public class Main extends Canvas {
    public Main() {
        setBackground(Color.WHITE); }
        public void paint(Graphics g) {

            Shape rect1 = new Rectangle(100,53, Color.GREEN, 375,208);
            Shape rect2 = new Rectangle(150,87, Color.BLUE, 275,140);
            Shape rect3 = new Rectangle(190,109, Color.RED, 195,96);
            Shape oval1 = new Oval(100,53,Color.YELLOW,375,208);
            Shape oval2 = new Oval(150,87,Color.CYAN,275,140);
            Shape oval3 = new Oval(190,109,Color.WHITE,195,96);

            rect1.draw(g);
            oval1.draw(g);
            rect2.draw(g);
            oval2.draw(g);
            rect3.draw(g);
            oval3.draw(g);

            int width = getWidth();
            int height = getHeight();
            g.setColor(Color.BLACK);
            //draw line from upper-left to lower-right
         //   g.drawLine(0,0,width,height);
            //draw line from lower left to upper left
            g.drawLine(0,height,0,0);
            //drawline from lower-right to upper-right
            g.drawLine(width,0,width,height);
            //drawline from upper-left to upper-right
            g.drawLine(0,0,width,0);
            //drawline from lower-left to lower-right
            g.drawLine(0,height,width,height);
        }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Main drawShapes = new Main();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(drawShapes);
        frame.setSize(600, 360);
        frame.setVisible(true);
    }
}
