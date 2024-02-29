package oop;
class Employee{
	private String name;
	private double salary;
	Employee(String n,double s){
		name=n;
		salary=s;
	}
	String getName() {return name;}
	void SetName(String n) {name=n;	}
	double getSalary() {return salary;}
	void SetSalary(double s) {salary=s;}
	
	void rasieSalary(double percenage) {
		salary+=salary*percenage/100;
	}
}
class Manager extends Employee{
	double bonus;
	Manager(String n,double s,double b){
		super(n,s);
		bonus=b;
	}
	double getBonus() {return bonus;}
	void SetBonus(double b) {bonus=b;}
	
	double getSalary() {
		return super.getSalary()+bonus;
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		
	Employee e1=new Employee("Ram",35000);
	e1.rasieSalary(10);
	System.out.println(e1.getSalary());
	//Manager m1=new Manager("Jhon",65000,0);
	//m1.SetBonus(20000);
	//System.out.println(m1.getSalary());
	Employee e2=new Manager("Ramya",68000,0);
	
	Employee[] employees=new Employee[5];
	employees[0]=e1;
	employees[1]=new Employee("Hari",33000);
	employees[2]=new Employee("vidhya",37000);
	employees[3]=new Manager("Jhon",65000,0.0);
	employees[4]=e2;
	
//	employees[3].SetSalary(75000);
//	Manager m1=(Manager)employees[3];
//	m1.SetBonus(20000);

	Manager m2;
	for(int i=0;i<5;i++) {
	if(employees[i] instanceof Manager) {
		m2=(Manager)employees[i];
		employees[i].SetSalary(100000);
		m2.SetBonus(20000);
	}
	}
	for(Employee e:employees) {
		if(employees[0]==e) {
			System.out.println(e.getName()+" "+e.getSalary());
		}
		else {
		e.rasieSalary(10);
		System.out.println(e.getName()+" "+e.getSalary());
	}}

	}

}
