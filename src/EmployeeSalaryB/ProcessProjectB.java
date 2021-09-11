package EmployeeSalaryB;

public class ProcessProjectB {
	private int sum;
	public ProcessProjectB() {
		
	}
	public ProcessProjectB(InputProjectB in) {
		int sum = 0;
		if(in.getSalary() < 50000){
			sum = (int)(0.05*in.getSalary());
			sum = sum + in.getSalary();
		}
		else {
			sum = (int)((0.10)*in.getSalary());
			sum = sum + in.getSalary();
		}
		this.sum = sum;
		//--project B--//
		if(this.sum < 20000) {
			this.sum = 20000;
		}

	}             
	public int getSum(){
		return this.sum;
	}
	public void setSum(int sum){
		this.sum = sum;
	}
}