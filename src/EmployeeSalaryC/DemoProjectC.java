package EmployeeSalaryC;

import java.util.Scanner;
public class DemoProjectC {
	public static void main(String[] args){
		int id,salary, sales;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter data Employee : ");
		id = input.nextInt();
		name = input.next();
		salary = input.nextInt();
		sales = input.nextInt();
		InputProjectC in = new InputProjectC(id,name,salary,sales);
		ProcessProjectC cess = new ProcessProjectC(in);
		OutputProjectC out = new OutputProjectC(in,cess);
	}
}