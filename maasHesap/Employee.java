package maasHesap;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hearYear;
	double tax;
	double bonus;
	double raise;
	
	Employee(String name, double salary, int workHours, int hearYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hearYear = hearYear;
		
	}		
	
	void tax() {
		if(this.salary < 1000) {
		    this.tax = this.salary *0;
		}else {
			this.tax = this.salary * 0.03;
		}
	}
	void bonus() {
		if(this.workHours >= 40) {
			this.bonus = 30*(this.workHours - 40);
		}
		
	}
	void raiseSalary() {
		if (2021 - this.hearYear < 40) {
			this.raise = this.salary * 0.05;
		}
		else if(2021 - this.hearYear > 9 && (2021 - this.salary) < 20) {
			this.raise = this.salary *0.1;
		}
		else {
			this.raise = this.salary * 0.15;
		}
	}
	void empleyeeInfo() {
        System.out.println("Adı Soyadı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hearYear);
        System.out.println("Vergi : " + this.tax);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Maaş Artışı : " + this.raise);
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş : " + (this.salary + this.bonus - this.tax));
        System.out.println("Toplam Maaş : " + ((this.salary + this.bonus - this.tax) + this.raise));
        System.out.println();
	}
	
}

