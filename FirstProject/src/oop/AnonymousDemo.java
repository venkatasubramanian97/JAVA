package oop;
//class Cycle{
//	void display() {
//		System.out.println("I am a cycle");
//	}
//}
//public class AnonymousDemo {
//
//	public static void main(String[] args) {
//		Cycle c=new Cycle()
//				{
//			void display() {
//				System.out.println("I am a tricycle");
//			}
//				};
//				Cycle c1=new Cycle();
//				c.display();
//				c1.display();
//		
//	}
//
//}
interface Drawable{  
void draw();  
}  
//Implementation: by second user  
class Rec implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Cir implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}  
//Using interface: by third user  
class AnonymousDemo{  
public static void main(String args[]){  
Drawable d=new Cir();//In real scenario, object is provided by method e.g. getDrawable()  
d.draw();  
Drawable e=new Drawable(){
	public void draw() {
		System.out.println("anonymous");
	}
};
Drawable v=()->System.out.println("lamda");
e.draw();
v.draw();
}}  