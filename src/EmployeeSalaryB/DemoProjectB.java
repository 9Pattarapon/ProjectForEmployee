package EmployeeSalaryB;

import java.util.Scanner;
public class DemoProjectB {
	public static void main(String[] args){
		int id,salary, sales;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter data Employee : ");
		id = input.nextInt();
		name = input.next();
		salary = input.nextInt();
		sales = input.nextInt();
		InputProjectB in = new InputProjectB(id,name,salary,sales);
		ProcessProjectB cess = new ProcessProjectB(in);
		OutputProjectB out = new OutputProjectB(in,cess);
	}
}