import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	private static PeopleManager manager = new PeopleManager();

	
	public static int menu() {
		System.out.println("---------------------------------");
		System.out.println("--Sistema de contole de Pessoas--");
		System.out.println("---------------------------------");	
		System.out.println("----------MENU DE OPÇÕES---------");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Buscar pelo CPF");
		System.out.println("3 - Atualizar ");
		System.out.println("4 - Remover ");
		System.out.println("5 - Sair ");
		System.out.println("---------------------------------");
		System.out.println("Escolha uma Opção:  ");
		return scanner.nextInt();

	}
	
	public static void register() {
		System.out.println("Digite o nome: ");
		String name = scanner.nextLine();
		System.out.println("Digite o CPF: ");
		String cpf = scanner.nextLine();
		Person person = new Person(name, cpf);
		if (manager.save(person)) {
			System.out.println("Pessoa cadastrada com sucesso!!");
			//debug
			//System.out.println(manager.getPeopleList());
		}
		else 
		{
			System.out.println("Erro ao cadastrar a pessoa");
		}
	}
	private static void search() {
		System.out.println("Digite o CPF: ");
		String cpf = scanner.nextLine();
		Person person = manager.search(cpf);
		if(person != null) {
			System.out.println("Pessoa encoontrada. Dados: ");
			System.out.println(person);
		}
		else {
			System.out.println("Pessoa não encontrada. Tente Novamente.");
		}
	}
	
	private static void update() {
		System.out.println("Digite o CPF: ");
		String cpf = scanner.nextLine();
		System.out.println("Digite o novo nome: ");
		String name = scanner.nextLine();
		if(manager.update(cpf, name)) {
			System.out.println("Dados atualiazados");
		}
		else {
			System.out.println("Erro ao atualizar os dados.");
		}
	}

	private static void remove() {
		System.out.println("Digite o CPF: ");
		String cpf = scanner.nextLine();
		if(manager.remove(cpf)) {
			System.out.println("Dado removido!");
		}
		else {
			System.out.println("Erro ao remover os dados.");
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
				search();
				break;
			}
			case 3 : {
				update();
				break;
			}
			case 4: {
				remove();
				break;
			}
			case 5: {
				System.out.println("Programa encerrado...");
				break;
			}
			default:
				System.out.println("Opção Invalida Tente Novamente!!");
			}
			System.out.println("Precione <ENTER> para continuar");
			scanner.nextLine();
		
		} while (option != 5);
		
	}


}
