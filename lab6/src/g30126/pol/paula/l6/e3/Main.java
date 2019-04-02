package g30126.pol.paula.l6.e3;


import java.awt.Color;

import g30126.pol.paula.l6.e1.Circle;
import g30126.pol.paula.l6.e1.DrawingBoard;
import g30126.pol.paula.l6.e1.Rectangle;
import g30126.pol.paula.l6.e1.Shape;

public class Main {
    public static void main(String[] args) {
        DrawingBoard b1 = new DrawingBoard();
        Shape s1 = new Circle(Color.RED, 90);
        b1.addShape(s1);
        s1.setId("a");
        s1.setfilled(false);
        Shape s2 = new Circle(Color.GREEN, 100);
        b1.addShape(s2);
        s2.setX(12);
        s2.setY(20);
        s2.setId("abb");
        s2.setfilled(false);
        Shape s3= new Rectangle(Color.BLACK,100,100);
        b1.addShape(s3);
        s2.setX(12);
        s3.setY(20);
        s3.setId("acc");
        s3.setfilled(false);
        b1.deleteById("a");
    }
}