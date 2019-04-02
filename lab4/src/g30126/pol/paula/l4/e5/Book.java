package g30126.pol.paula.l4.e5;

import g30126.pol.paula.l4.e4.Author;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock=0;
public Book (String name, Author author, double price) {
	this.name=name;
	this.author=author;
	this.price=price;
}
public Book (String name, Author author, double price,int qtyInStock) {
	this.name=name;
	this.author=author;
	this.price=price;
	this.qtyInStock=qtyInStock;
}
public String getName() {
	return this.name;
}
public Author getAuthor() {
	return this.author;
}
public double getPrice() {
	return this.price;
}
public void setPrice(double price) {
	this.price=price;
}
public int getqtyInStock() {
   return this.qtyInStock;
	
}
public void setInstock(int qtyInStock) {
	this.qtyInStock=qtyInStock;
}
public String toString() {
	return this.name+" by "+this.author.toString(); 
}

}
