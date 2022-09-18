package Company;


public class Salesman extends Employee {

	protected double yearsale;
	Employee employee;

	
	public Salesman() {
	}
	
	public void Employee() {
		employee = new Employee();
	}

	public Salesman(double yearsale, String name, double monthpay) {
		super();
		this.name = name;
		this.monthpay = monthpay;
		this.yearsale = yearsale;

	}
	
	

	public double getYearsale() {
		return yearsale;
	}

	public void setYearsale(double yearsale) {
		this.yearsale = yearsale;
	}

	public double annualSalaly() {
		double add =  yearsale * 0.02;
		
		if(add > 20000) {
			add = 20000;
			}//20000넘을 경우 20000 상한선
		double annualSalaly = monthpay * 12 + add; 
		
		return annualSalaly;
		
		}

	@Override
	public String toString() {
		return  "name: " + name +"\n" + "monthpay: "+ monthpay +"\n"+ 
				"annualSalary: " + annualSalaly() ;
	}

 
	
	
	
	


	
}
