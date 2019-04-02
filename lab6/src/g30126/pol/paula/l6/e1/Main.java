package g30126.pol.paula.l6.e1;


import java.awt.*;
public class Main {

    public static void main(String[] args) {
        DrawingBoard b1 = new DrawingBoard();
        Shape s1 = new Circle(Color.RED,"1",10,50,true, 90);
        b1.addShape(s1);
        Shape s2 = new Circle(Color.GREEN,"2",300, 50,true, 100);
        b1.addShape(s2);
        Shape s3 = new Rectangle(Color.BLACK,"3",400,400,true,100,200);
        b1.addShape(s3);
        b1.deleteShape("2");
    }
}
