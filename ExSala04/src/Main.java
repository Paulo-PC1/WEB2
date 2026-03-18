import java.util.Scanner;
	
public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static LibraryManager manager = new LibraryManager();

	public static int menu() {
		System.out.println("----------------------------------");
		System.out.println("------------Library System-----------");
		System.out.println("----------------------------------");	
		System.out.println("------------OPTION MENU-----------");
		System.out.println("1 - Add a Book");
		System.out.println("2 -Take a Book");
		System.out.println("3 -Give back a Book ");
		System.out.println("4 -Search a Book ");
		System.out.println("5 -Show all Books");
		System.out.println("6 - Exit ");
		System.out.println("----------------------------------");
		System.out.println("Choose an option:  ");
		return scanner.nextInt();
	}
	
	private static void register() {
		System.out.println("Enter the code of the book");
		String code = scanner.nextLine();
		System.out.println("Entre the title of the book: ");
		String title = scanner.nextLine();
		System.out.println("Enter the Author of the book: ");
		String author = scanner.nextLine();
		Book book = new Book(code, title, author);
		if(manager.saveBook(book)){
			System.out.print("book registred!!");
		}
		else 
		{
			System.out.println("Error on register the book!!");
		}
	}
	
	private static void take() {
		System.out.println("Enter the title of the book");
		String title = scanner.nextLine();
		System.out.println("Book data:");
		System.out.println(manager.getLibraryList());
		if(manager.takeBook(title)) {
			System.out.println("Book taken!");
		}else 
		{
			System.out.println("Error when picking up book. Please correct the data of the book!!");
		}
		
	}

	private static void give() {
		System.out.println("Enter the code of the book");
		String code = scanner.nextLine();
		System.out.println("Entre the title of the book: ");
		String title = scanner.nextLine();
		System.out.println("Enter the Author of the book: ");
		String author = scanner.nextLine();
		Book book = new Book(code, title, author);
		if(manager.saveBook(book)){
			System.out.print("Book gived back!!");
		}
		else 
		{
			System.out.println("Error on gived back book!!");
		}
	}

	
	private static void search() {
		System.out.println("Enter the Book Title: ");
		String title = scanner.nextLine();
		Book book = manager.search(title);
		if(book != null) {
			System.out.println("Book found. Data: ");
			System.out.println(book);
		}
		else {
			System.out.println("Book not found. Try Again.");
		}
	}
	
	private static void show() {
		System.out.println("Tasks registred:");
		System.out.println(manager.getLibraryList());
		
	}

		
	public static void main(String[] args) {
		int option;
		
		do {
			
			option = menu();
			scanner.nextLine();
			switch (option) {
			case 1: {
				register();
				break;
			}
			case 2: {
				take();
				break;
			}
			case 3: {
				give();
				break;
			}
			case 4: {
				search();
				break;
			}
			case 5:{
				show();
				break;
			}
			case 6: {
				System.out.println("Shuting down the program...");
				break;
			}
			default:
				System.out.println("Choose an valid option. Try Again!!");
			}
			System.out.println("Press <ENTER> to continue");
			scanner.nextLine();
			
		} while (option != 6);
	}

}
