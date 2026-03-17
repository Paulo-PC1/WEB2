
public class Book {
	
	private String code;
	private String title;
	private String author;
	
	public Book(String code, String title, String author) {
		this.code = code;
		this.title = title;
		this.author = author;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	@Override
	public String toString() {
		return "Book List: [Book code:" + code + "- Title: " + title + "- Author: " + author + "]";
	}
	
}
