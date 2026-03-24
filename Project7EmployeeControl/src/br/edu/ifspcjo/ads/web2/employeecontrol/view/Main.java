package br.edu.ifspcjo.ads.web2.employeecontrol.view;

import br.edu.ifspcjo.ads.web2.employeecontrol.model.ComissionedEmployee;
import br.edu.ifspcjo.ads.web2.employeecontrol.model.Employee;
import br.edu.ifspcjo.ads.web2.employeecontrol.model.HourlyEmployee;
import br.edu.ifspcjo.ads.web2.employeecontrol.model.SalariedAndComissionedEmployee;
import br.edu.ifspcjo.ads.web2.employeecontrol.model.SalariedEmployee;

public class Main {
	
	public static void main(String[] args) {
		
		//Employee employee0 = new Employee("Ana", "0101"); não funciona pois classe é abstrata método public abstract calculateIncome(); é abstrato, para ser 
		//implementado deveria ser public calculateIncome(){ return 0};
		
		Employee employee1 = new SalariedEmployee("Ana", "1234", 3000);
		
		System.out.println(employee1);
		System.out.println("Income = R$ " + employee1.calculateIncome());
		
		Employee employee2 = new HourlyEmployee("Adriana", "5678", 40, 30);
		
		System.out.println(employee2);
		System.out.println("Income = R$ " + employee2.calculateIncome());
		
		Employee employee3 = new ComissionedEmployee("Julia", "8765", 50000, 5);
		
		System.out.println(employee3);
		System.out.println("Income = R$ " + employee3.calculateIncome());
		
		Employee employee4 = new SalariedAndComissionedEmployee("Mariana", "4321", 50000, 5, 2000);
		
		System.out.println(employee4);
		System.out.println("Income = R$ " + employee4.calculateIncome());
	}
}
