package EmployeeSalaryA;

public class ProcessProjectA {

	private int sum;
	public ProcessProjectA() {

	}
	public ProcessProjectA(InputProjectA in) {
		int sum = 0;
		//--project A --//
		if(in.getSalary() < 50000){
			sum = (int)(0.05*in.getSalary());
			sum = sum + in.getSalary();
		}
		else {
			sum = (int)((0.10)*in.getSalary());
			sum = sum + in.getSalary();
		}
		this.sum = sum;

	}             
	public int getSum(){
		return this.sum;
	}
	public void setSum(int sum){
		this.sum = sum;
	}
} 
