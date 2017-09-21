package cn.itcast.model;

public class Book {
	private String bookName;
	private	String author;
	private	String press;
	private	double price;
	private	String bookNumber;
	private	String publicationDate;
	
	
	
	public Book() {
		super();
	}
	
	public Book(String bookName,String author,String press,double price,String bookNumber,String publicationDate) {
		this.setBookName(bookName);
		this.setAuthor(author);
		this.setPress(press);
		this.setPrice(price);
		this.setBookNumber(bookNumber);
		this.setPublicationDate(publicationDate);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookName + "\t" + author +"\t"+ press +"\t"+ price +"\t" + bookNumber +"\t"+ publicationDate +"\n";
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	
	
	
	
}
