package EmployeeSalaryEditA;

public class ProcessProjectA {
	private int sum;
	public ProcessProjectA() {
		
	}
	public ProcessProjectA(InputProjectA in) {
		int sum = 0;
		if(in.getSalary() <= 10000){
			sum = (int)(0.5*in.getSalary());
			sum = sum + in.getSalary();
		}
		else {
			sum = (int)(0.10*in.getSalary());
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
