package br.edu.ifspcjo.ads.web2.employeecontrol.model;

public class ComissionedEmployee  extends Employee{

	protected double salesValue;
	protected double comissionPencentage;
	
	public ComissionedEmployee(String name, String cpf, double salaesValue, double comissionPercentage) {
		super(name, cpf);
		this.salesValue = salaesValue;
		this.comissionPencentage = comissionPercentage;	
	}

	public double getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(double salesValue) {
		this.salesValue = salesValue;
	}

	public double getComissionPencentage() {
		return comissionPencentage;
	}

	public void setComissionPencentage(double comissionPencentage) {
		this.comissionPencentage = comissionPencentage;
	}

	@Override
	public String toString() {
		return "Comissioned Employee [Sales Value= " + salesValue + ", Comission Pencentage= " + comissionPencentage + ", Name= " + name + ", CPF= " + cpf + "]";
	}

	@Override
	public double calculateIncome() {
		return salesValue * comissionPencentage / 100;
	}
}
