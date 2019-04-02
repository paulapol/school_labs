package g30126.pol.paula.l4.e3;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Student
 *
 */
public class CircleTest {

	@Test
	public void testGetArea() {
		Circle c=new Circle();
		double area=c.GetArea();
		double a=Math.PI*1*1;
		
		assertEquals(area,a,0.01);
	}

}