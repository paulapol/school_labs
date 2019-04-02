package g30126.pol.paula.l6.e1;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawingBoard  extends JFrame {

    Shape[] shapes = new Shape[10];
    //	ArrayList<Shape> shapes = new ArrayList<>();

    public DrawingBoard() {
        super();
        this.setTitle("Drawing board example");
        this.setSize(800,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void addShape(Shape s1){
        for(int i=0;i<shapes.length;i++){
            if(shapes[i]==null){
                shapes[i] = s1;
                break;
            }
        }
//        shapes.add(s1);
        this.repaint();
    }
    public void deleteShape(String x){
        for(int i=0;i<shapes.length;i++){
            if(shapes[i]!=null && shapes[i].getId().equals(x))
                shapes[i]=null;
        }
        this.repaint();
    }

    public void paint(Graphics g){
        for(int i=0;i<shapes.length;i++){
            if(shapes[i]!=null)
                shapes[i].draw(g);
        }
//        for(Shape s:shapes)
//            s.draw(g);
    }
}
