package EmployeeSalaryEditA;

import java.util.Scanner;

import EmployeeSalaryA.InputProjectA;
import EmployeeSalaryA.OutputProjectA;
import EmployeeSalaryA.ProcessProjectA;
public class DemoProjectA {
	public static void main(String[] args){
		int id,salary, sales;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter data Employee : ");
		id = input.nextInt();
		name = input.next();
		salary = input.nextInt();
		sales = input.nextInt();
		InputProjectA in = new InputProjectA(id,name,salary,sales);
		ProcessProjectA cess = new ProcessProjectA(in);
		OutputProjectA out = new OutputProjectA(in,cess);
	}
}