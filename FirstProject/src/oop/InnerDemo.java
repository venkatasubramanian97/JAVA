package oop;
class Outer{
	int num;
	void outerdisplay() {
		System.out.println(num);
		System.out.println("outer class");
	}
	class Inner{
		int x;
		void innerdisplay() {
			System.out.println("inner class");
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.num=10;
		//System.out.println(o.num);
		o.outerdisplay();
		Outer.Inner i=o.new Inner();
		i.x=20;
		System.out.println(i.x);
		i.innerdisplay();
	}

}
