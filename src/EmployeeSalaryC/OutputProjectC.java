package EmployeeSalaryC;

public class OutputProjectC {
	public OutputProjectC(){
		
	}
	public OutputProjectC(InputProjectC in,ProcessProjectC cess){
		System.out.println("Name : "+in.getName()+"\nTotal : "+cess.getSum());
	}
}