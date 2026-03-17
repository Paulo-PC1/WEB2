import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	private static TaskManager manager = new TaskManager();

	public static int menu() {
		System.out.println("----------------------------------");
		System.out.println("------------Task System-----------");
		System.out.println("----------------------------------");	
		System.out.println("------------OPTION MENU-----------");
		System.out.println("1 - Add a Task");
		System.out.println("2 - Remove a Task");
		System.out.println("3 - List Tasks ");
		System.out.println("4 - Exit ");
		System.out.println("----------------------------------");
		System.out.println("Choose an option:  ");
		return scanner.nextInt();
	}
	
	public static void register() {
		System.out.println("Enter the code of a Task");
		int code = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Entre the name of a Task: ");
		String name = scanner.nextLine();
		Tasks task = new Tasks(code, name);
		if(manager.saveTask(task)){
			System.out.print("Task Registred!!");
		}
		else 
		{
			System.out.println("Error on register the Task!!");
		}
	}
	
	private static void list() {
		System.out.println("Tasks registred:");
		System.out.println(manager.getTaskList());
	}

	private static void remove() {
		System.out.println("Enter the code: ");
		int code = scanner.nextInt(); 
		scanner.nextLine();
		if(manager.removeTask(code)) {
			System.out.println("Task removed!");
		}
		else {
			System.out.println("Error on remove Task!!");
		}
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
				remove();
				break;
			}
			case 3: {
				list();
				break;
			}
			case 4: {
				System.out.println("Shuting down the program...");
			}
			default:
				System.out.println("Choose an valid option. Try Again!!");
			}
			System.out.println("Press <ENTER> to continue");
			scanner.nextLine();
			
		} while (option != 4);
	}
}
