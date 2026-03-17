import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
	
		private List<Book> bookList;
		
		public LibraryManager() {
			bookList = new ArrayList<>();
		}
		
		public List<Book> getLibraryList(){
			return bookList;
		}

		public boolean saveBook(Book book) {
			if(book != null) {
				bookList.add(book);
				return true;
			}
			return false;
		}
		
		public Book search(String title) {
			for(Book book: bookList) {
				if(book.getTitle().equals(title)){
					return book;
				}
			}
			return null;
				
		}
		
		public boolean takeBook(String title) {
			Book book = search(title);
			if(book != null) {
				if(book.getTitle().equals(title))
					bookList.remove(book);
					return true;
				}
			return false;
			}	
			
		}
