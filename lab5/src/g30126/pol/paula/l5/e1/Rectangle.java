package g30126.pol.paula.l5.e1;


public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle(){

    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length = length;
    }
    public Rectangle(double width, double length, String colour, boolean filled){
        super(colour,filled);
        this.width=width;
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return 2*(this.width+this.length);
    }
    @Override
    public String toString(){
        return "Rectangle{"+" colour="+color
                +" filled="+filled
                +" width="+width
                +" length="+ length;
    }
}
