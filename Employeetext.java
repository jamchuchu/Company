package Company.text;

public class Employeetext {
	
	  int year;
	  String post;
	  String name;
	  double monthpay;
	  double add;
	
	
	public Employeetext() {
		// TODO Auto-generated constructor stub
	}


	public Employeetext(int year, String post, String name, double monthpay,double add) {
		super();
		this.year = year;
		this.post = post;
		this.name = name;
		this.monthpay = monthpay;
		this.add = add;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getPost() {
		return post;
	}


	public void setPost(String post) {
		this.post = post;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAdd() {
		return add;
	}


	public void setAdd(double add) {
		this.add = add;
	}


	public double getMonthpay() {
		return monthpay;
	}


	public void setMonthpay(double monthpay) {
		this.monthpay = monthpay;
	}


	@Override
	public String toString() {
		return "Employeetext [year=" + year + ", post=" + post + ", name=" + name + ", monthpay=" + monthpay + ", add="
				+ add + "]";
	}


 
	
	
	
	
	
}
