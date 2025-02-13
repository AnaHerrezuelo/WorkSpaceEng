package Inheritance;

public class Books {
	String title, author, isbn;

	public Books() {
		
	}
	
	public Books(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public void askData() {
		
	}
	
	//PRINT
	public void printToString() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Books [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
	}
	
	
	

}
