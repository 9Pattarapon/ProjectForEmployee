package EmployeeSalaryEditA;


import EmployeeSalaryA.InputProjectA;
import EmployeeSalaryA.ProcessProjectA;

public class OutputProjectA {
	public OutputProjectA(){
		
	}
	public OutputProjectA(InputProjectA in,ProcessProjectA cess){
		System.out.println("Name : "+in.getName()+"\nTotal : "+cess.getSum());
	}
}