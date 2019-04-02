package g30126.pol.paula.l6.e3;


import java.awt.Color;
import java.awt.Graphics;
public class Rectangle implements Shape {
     int length=20;
     int width=10;
     int x=87;
     int y=210;
     String id="aa";
     boolean fill=true;
    Color color=Color.RED;

    public Rectangle(Color color, int length, int width) {
        this.color=color;
        this.length = length;
        this.width=width;
    }
    public int getLength() {
		return length;
	}
    public int getWidth() {
		return width;
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
    public void draw(Graphics g){
        System.out.println("Drawing a rectangel "+length+" "+getColor().toString());
        g.setColor(getColor());
        if(getfill()==true)
        	g.fillRect(getx(), gety(), getWidth(), getLength());
        else
        	g.drawRect(getx(), gety(), getWidth(), getLength());
        g.drawString(getId(), getx(), gety());
    }
}
