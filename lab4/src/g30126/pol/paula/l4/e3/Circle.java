package g30126.pol.paula.l4.e3;

public class Circle{
	private double radius;
	private String color;
	Circle(){
		radius=1.0;
		color="red";
	}
	Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
	}
	public double GetRadius(){
		return radius;
	}
	public double GetArea(){
		return Math.PI*radius*radius;
	}
	public static void main(String[] args){
		
	}
}