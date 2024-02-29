package OOPS;
import java.util.*;
//import java.lang.Integer;
class Employee1 implements Comparable<Employee1>{
	private String name;
	private double salary;
	Employee1(String n,double s){
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
	public int compareTo(Employee1 e) {
		if(this.salary==e.salary)
			return 0;
		if(this.salary>e.salary)
			return 1;
		return -1;
	}
}
class Manager1 extends Employee1{
	double bonus;
	Manager1(String n,double s,double b){
		super(n,s);
		bonus=b;
	}
	double getBonus() {return bonus;}
	void SetBonus(double b) {bonus=b;}
	
	double getSalary() {
		return super.getSalary()+bonus;
	}
}
public class CompartoDemo {
	public static void main(String[] args) {
		
		Employee1 e1=new Employee1("Ram",35000);
		e1.rasieSalary(10);
		System.out.println(e1.getSalary());
		//Manager m1=new Manager("Jhon",65000,0);
		//m1.SetBonus(20000);
		//System.out.println(m1.getSalary());
		Employee1 e2=new Manager1("Ramya",68000,0);
		
		Employee1[] employees=new Employee1[5];
		employees[0]=e1;
		employees[1]=new Employee1("Hari",33000);
		employees[2]=new Employee1("vidhya",37000);
		employees[3]=new Manager1("Jhon",65000,0.0);
		employees[4]=e2;
		
//		employees[3].SetSalary(75000);
//		Manager m1=(Manager)employees[3];
//		m1.SetBonus(20000);

		Manager1 m2;
		for(int i=0;i<5;i++) {
		if(employees[i] instanceof Manager1) {
			m2=(Manager1)employees[i];
			employees[i].SetSalary(100000);
			m2.SetBonus(20000);
		}
		}
		for(Employee1 e:employees) {
			if(employees[0]==e) {
				System.out.println(e.getName()+" "+e.getSalary());
			}
			else {
			e.rasieSalary(10);
			System.out.println(e.getName()+" "+e.getSalary());
		}}
		System.out.println("----------------");
		Arrays.sort(employees);
		for(Employee1 e:employees) {

				System.out.println(e.getName()+" "+e.getSalary());
			}
			

		}

}
