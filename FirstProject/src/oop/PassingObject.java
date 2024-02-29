package oop;
class Box1{
	int length;
	int breath;
	int height;
	Box1(){
		length=breath=height=1;
	}
	Box1(int l,int b,int h){
		length=l;
		breath=b;
		height=h;
	}
	Box1(Box1 b){
		length=b.length;
		breath=b.breath;
		height=b.height;
	}
	boolean isequal(Box1 b) {
		//b.length++;
		if(this.length==b.length&&this.breath==b.breath&&this.height==b.height)
			return true;
		return false;
	}
	Box1 doublebox(){
		Box1 temp=new Box1(2*length,2*breath,2*height);
		return temp;
		
	}
	
}
public class PassingObject {

	static int increament(int a) {
		return a++;

		
	}
	public static void main(String[] args) {
		int a=10;
		System.out.println(increament(a));
		Box1 B1=new Box1(5,6,7);
		Box1 B2=new Box1(5,6,7);
		System.out.println(B1.isequal(B2));
		System.out.println(B2.length);
		Box1 b4=new Box1(B1);
		System.out.println(b4.length);
		Box1 B3=B1.doublebox();
		System.out.println(B3.length);
	}
}



