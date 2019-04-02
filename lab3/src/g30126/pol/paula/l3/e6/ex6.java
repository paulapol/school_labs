package g30126.pol.paula.l3.e6;

public class ex6{
	public static void main(String[] args) {
    MyPoint p1 = new MyPoint(1, 2);
    MyPoint p2 = new MyPoint(1, 4);
    System.out.println(p1.distance(p2));
    System.out.println(p1.distance(5, 6));
    MyPoint p3 = new MyPoint(); 
    System.out.println(p3);      
    p3.setX(8);   
    p3.setY(6);
    System.out.println("x is: " + p3.getX());  
    System.out.println("y is: " + p3.getY());
    p3.setXY(3, 0);   
    System.out.println(p3);
    MyPoint p4 = new MyPoint(0, 4);  
    System.out.println(p4);
    System.out.println(p3.distance(p4));    
    System.out.println(p4.distance(p3));    
    System.out.println(p3.distance(5, 6));  
}
}