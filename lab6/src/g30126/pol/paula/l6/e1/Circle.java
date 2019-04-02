package g30126.pol.paula.l6.e1;


import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape{

    private int radius;

    public Circle(Color color,String id,int x,int y,boolean fill, int radius) {
        super(color,id,x,y,fill);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Ellipse2D.Double circle = new Ellipse2D.Double(getx(), gety(), getRadius(), getRadius());
        System.out.println("Drawing a circle "+this.radius+" "+getColor().toString());
        g.setColor(getColor());
        g.drawOval(getx(), gety(),radius,radius);
        if(isFilled()==true){
            g2.fill(circle);
            g2.setPaint(getColor());
        }
    }
}