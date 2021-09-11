package EmployeeSalaryB;

public class OutputProjectB {
	public OutputProjectB(){
		
	}
	public OutputProjectB(InputProjectB in,ProcessProjectB cess){
		System.out.println("Name : "+in.getName()+"\nTotal : "+cess.getSum());
	}
}
