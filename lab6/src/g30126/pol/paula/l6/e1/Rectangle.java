package g30126.pol.paula.l6.e1;


import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape{

    private int width,length;

    public Rectangle(Color color,String id,int x,int y,boolean fill, int length,int width) {
        super(color,id,x,y,fill);
        this.length = length;
        this.width=width;
    }
    public int getWidth(){
        return this.width;
    }

    public void setWidth(int width){
        this.width=width;
    }

    public int getLength(){
        return this.length;
    }

    public void setLength(int length){
        this.length=length;
    }




    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        System.out.println("Drawing a rectangel "+length+" "+width+" "+getColor().toString());
        g.setColor(getColor());
        g.drawRect(getx(), gety(), getWidth(), getLength());
        if(isFilled()==true){
            g2.fill(new Rectangle2D.Double(getx(), gety(), getWidth(),getLength() ));
            g2.setPaint(getColor());
        }

    }
}