package oop;
class Department implements Cloneable{
	int depit;
	String name;
	Department(int id,String n){
		depit=id;
		name=n;
	}
	Department(Department d){
		this.depit=d.depit;
		this.name=d.name;
		}
	void display() {
		System.out.println("depit is : "+depit);
		System.out.println("Name is : "+name);
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Student implements Cloneable{
	int id;
	String name;
	Department dept;
	Student(int i,String n,Department d){
		id=i;
		name=n;
		dept=d;
	}
	Student(Student s){
		this.id=s.id;
		this.name=s.name;
		this.dept=new Department(s.dept);
	}
	
	void display() {
		System.out.println("Id is : "+id);
		System.out.println("Name is : "+name);
		dept.display();
	}
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		Student s=(Student)super.clone();
		s.dept=(Department)s.dept.clone();
		return s;
	}
}
public class Objectclone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Department dept=new Department(1,"social science");
		Student s1=new Student(1,"vasu",dept);
		Student s2=(Student) s1.clone();
		Student s3=new Student(s1);
		//dept.display();
		dept.name="maths";
		s1.display();
		s2.display();
		//Student s3=new Student(s1);
		s3.display();

	}

}
