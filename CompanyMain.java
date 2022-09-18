package Company;

import Company.text.Employeetext;

public class CompanyMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee;
		Salesman salesman;
		Excutive excutive;

		//메모장 생성--5년치 기록
		Employeetext[][] employeetexts = new Employeetext[5][10];

		String[] name = new String[] {"a","b","c","d","e","f","g","h","i","k"};
		String[] post = new String[] {"employee","employee","employee","salesman","salesman","salesman"
										,"salesman", "salesman", "executive" ,"executive"};
		double[] monthpay = new double[] {2000, 2000,2000,3000,3000,3000,3000,3000,5000,5000};
		double[] add = new double[] {0,0,0,10000,200000,25000,70000,100000,50,35};
		

		for (int i = 0 ; i< 5; i++) {
			for (int j = 0; j< 10 ; j++) {
				employeetexts[i][j] = new Employeetext(2015+i,post[j],name[j],monthpay[j],add[j]);
			}
		}// 메모장 완료
		
		for (int i = 0 ; i< 5; i++) {
			for (int j = 0; j< 10 ; j++) {
				String pp = employeetexts[i][j].getPost();
				if (pp.equals("employee")) {
					System.out.println("[ "+employeetexts[i][j].getYear()+" ]");
					System.out.println("<"+ pp +">");
					employee = new Employee();
					employee.name = employeetexts[i][j].getName();
					employee.monthpay= employeetexts[i][j].getMonthpay();
					System.out.println(employee.toString());
				}else if(pp.equals("salesman")) {
					System.out.println("[ "+employeetexts[i][j].getYear()+" ]");
					System.out.println("<"+ pp +">");
					salesman = new Salesman();
					salesman.name = employeetexts[i][j].getName();
					salesman.monthpay = employeetexts[i][j].getMonthpay();
					salesman.yearsale = employeetexts[i][j].getAdd();
					System.out.println(salesman.toString());
				}else {
					System.out.println("[ "+employeetexts[i][j].getYear()+" ]");
					System.out.println("<"+ pp +">");
					excutive = new Excutive();
					excutive.name = employeetexts[i][j].getName();
					excutive.monthpay = employeetexts[i][j].getMonthpay();
					excutive.stock = employeetexts[i][j].getAdd();
					System.out.println(excutive.toString());
				}


				
			}
		}
		
		
	

	}

}
