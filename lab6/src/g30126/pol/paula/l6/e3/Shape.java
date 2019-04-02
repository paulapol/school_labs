package g30126.pol.paula.l6.e3;



import java.awt.Color;
import java.awt.Graphics;

public interface Shape {
    public Color getColor();
    public void setColor(Color color);
    public void setfill(boolean fill);
    public boolean  getfill();
    public int getx();
   public void setx(int x);
   public int gety();
   public void sety(int y);
   public void setId(String id);
   public String getId();
    public void draw(Graphics g);
}
