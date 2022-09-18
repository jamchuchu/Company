package Company;

public class Employee {

	
	protected String name;
	protected double monthpay;
	
	public Employee() {
	}

	public Employee(String name, double monthpay) {
		super();
		this.name = name;
		this.monthpay = monthpay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthpay() {
		return monthpay;
	}

	public void setMonthpay(int monthpay) {
		this.monthpay = monthpay;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\n" + "Monthly Salary: " 
				+ monthpay +"\n" + "AnnualSalary: " + monthpay*12;
	}
	
	  
}
