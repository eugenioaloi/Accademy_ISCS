package model;

public class Book {
	
	private String isbn;
	private String desc;
	private String author;
	private double price;
	private String nationality;
	
	public Book(String isbn, String desc, String author, double price, String nationality) {
		super();
		this.isbn = isbn;
		this.desc = desc;
		this.author = author;
		this.price = price;
		this.nationality = nationality;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", desc=" + desc + ", author=" + author + ", price=" + price + ", nationality="
				+ nationality + "]";
	}

}
