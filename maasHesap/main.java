package maasHesap;

public class main {

	public static void main(String[] args) {
		Employee isci = new Employee("Batuhan" ,9000,43,2002);
		Employee isci1 = new Employee("Emircan",8000,45,2010);
		Employee isci2 = new Employee("Murat",9000,50,2021);
		Employee isci3 = new Employee("Erdem",900,15,2021);
		isci.tax();
		isci.bonus();
		isci.raiseSalary();
		isci.empleyeeInfo();
		
		isci1.tax();
		isci1.bonus();
		isci1.raiseSalary();
		isci1.empleyeeInfo();
		
		isci2.tax();
		isci2.bonus();
		isci2.raiseSalary();
		isci2.empleyeeInfo();
		
		isci3.tax();
		isci3.bonus();
		isci3.raiseSalary();
		isci3.empleyeeInfo();
		
		

	}

}
