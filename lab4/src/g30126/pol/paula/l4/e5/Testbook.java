package g30126.pol.paula.l4.e5;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import g30126.pol.paula.l4.e4.Author;
import g30126.pol.paula.l4.e6.Book;
public class Testbook {
	@Test
	public  void TestToString() {
		Author a2=new Author("Pop Dan","popdan@yahoo.com",'m');
		Book b1=new Book("Maze Runner",a2,125);
		assertEquals(b1.getName()+" by "+a2.toString(),b1.toString());
	
	}
	@Test
	public void TestgetName() {
		Author x=new Author("IonCreanga","IonCreanga@yahoo.com",'M');
		Book b1=new Book("Mazee Runner2",x,172);
		assertEquals("Mazee Runner2",b1.getName());
	}
	@Test
	public void getAuthor() {
		  Author  x = new Author("Mihai Eminescu", "ion.creanga@junimea.ro", 'M');
		    Book b1 = new Book("BAC", x, 10, 50);

		    assertEquals("Mihai Eminescu", x.getName());
		 
	}
	@Test
	public void TestGetPrice() {
	  Author  x = new Author("Mihai Eminescu", "ion.creanga@junimea.ro", 'M');
	    Book b1 = new Book("Literatura Romaneasca", x, 10, 50);

	    assertEquals(10, b1.getPrice(), 0.01);
	}
	@Test
	public void TestSetPrice() {
	  Author  x = new Author("Mihai Eminescu", "ion.creanga@junimea.ro", 'M');
	    Book b1 = new Book("BAC", x, 10, 50);

	    b1.setPrice(25);

	    assertEquals(25, b1.getPrice(), 0.01);
	}
	@Test
	public void TestGetQtyInStock() {
	   Author x = new Author("Mihai Eminescu", "ion.creanga@junimea.ro", 'M');
	   Book b1 = new Book("Literatura Romaneasca Esentiala", x, 10, 50);

	    assertEquals(50, b1.getqtyInStock());
	}
	@Test
	public void setInstock() {
	  Author  x = new Author("Ion Creanga", "mihai.eminescu@junimea.ro", 'M');
	    Book b1 = new Book("BAC", x, 10, 50);

	    b1.setPrice(25);

	    assertEquals(25, b1.getPrice(), 0.01);
	}
}
