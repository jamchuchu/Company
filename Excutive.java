package Company;

public class Excutive extends Employee{
	
	protected double stock;
	Employee employee;
	
	
	void employee() {
		employee = new Employee();
	}
	
	public Excutive() {
		// TODO Auto-generated constructor stub
	}
	
	public Excutive( String name, double monthpay,double stock) {
		super();
		this.name = name;
		this.monthpay = monthpay;
		this.stock = stock;

	}
	
	public double getstock() {
		return stock;
	}

	public void setstock(double stock) {
		this.stock = stock;
	}


	double annualSalaly() {
		double nowstock = getstock();
		double add = 0;
		if (nowstock> 50) {
			 add = 30000;
		}
		double annualSalaly = monthpay * 12 + add;
		return annualSalaly;
	}

	@Override
	public String toString() {
		return "name: " + name + "\n" + "monthpay: "+monthpay + "\n"
				+"annualSalaly: " + annualSalaly() ;
	}
	
	
	

}
