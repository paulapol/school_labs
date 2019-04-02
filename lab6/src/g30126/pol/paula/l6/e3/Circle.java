package g30126.pol.paula.l6.e3;

import java.awt.*;
public class Circle implements Shape{
	 int length=20;
     int width=10;
     int x=87;
     int y=210;
     String id="aa";
     boolean fill=true;
    Color color=Color.RED;
     int radius=90;
public Circle(Color color, int radius) {
       this.color=color;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public int getx() {
    	return x;
    }
    public int gety() {
    	return y;
    }
    public void setx(int x) {
    	this.x= x;
    }
    public void sety(int y) {
    	this.y= y;
    }
    public void setId(String id) {
    	this.id = id;
    }
    public String getId() {
    	return id;
    }
    public void setfill(boolean fill) {
    this.fill = fill;
    }
    public boolean getfill() {
    	return fill;
    }
    @Override
    public void draw(Graphics g) {
        System.out.println("Drawing a circle "+this.radius+" "+getColor().toString());
        g.setColor(getColor());
        //g.drawOval(50,50,radius,radius);
        if(getfill()==true)
        	g.fillOval(getx(), gety(), radius, radius);
        else 
        g.drawOval(getx(),gety(),getRadius(),getRadius());
        g.drawString(getId(), getx(), gety());
    }
}