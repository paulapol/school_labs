package g30126.pol.paula.l4.e4;

import static org.junit.Assert.*;

import org.junit.Test;

public class AuthorTest {
	
	Author a=new Author("nume","email",'F');

	@Test
	public void testsetEmail() {
		a.setEmail("email1");
		assertEquals(a.getEmail(),"email1");
	}
	@Test
	public void testToString(){
		assertEquals(a.ToString(),"Author-nume(F)at email:email");
	}

}