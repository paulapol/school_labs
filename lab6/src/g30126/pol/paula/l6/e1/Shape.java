package g30126.pol.paula.l6.e1;


import java.awt.*;
public abstract class Shape {
    private Color color;
    public String id;
    public boolean fill;
    public int x,y; //subpunctul 2, pentru a pozitiona shapes oriunde

    public Shape(Color color) {
        this.color = color;
    }

    public Shape(Color color,String id){
        this.color=color;
        this.id=id;
    }

    public Shape(Color color,String id, boolean fill){
        this.color=color;
        this.id=id;
        this.fill=fill;
    }
    public Shape(Color color, String id, int x,int y,boolean fill){
        this.color=color;
        this.id=id;
        this.x=x;
        this.y=y;
        this.fill=fill;
    }

    public int getx(){
        return this.x;
    }

    public void setx(int x){
        this.x=x;
    }

    public int gety(){
        return this.y;
    }

    public void sety(int y){
        this.y=y;
    }

    public boolean isFilled(){
        return this.fill;
    }

    public void getFilled(boolean filled){
        this.fill=fill;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id=id;
    }

    public abstract void draw(Graphics g);

}