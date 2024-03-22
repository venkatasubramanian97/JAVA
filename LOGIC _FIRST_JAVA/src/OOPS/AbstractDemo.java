package OOPS;
abstract class Shape{
	protected String objectname;
	Shape(String name){
		objectname=name;
	}
	
	public void moveto(int x,int y) {
		System.out.println("X"+x+" "+"Y"+y);
	}
	abstract public double area();
	abstract public void draw();
}
class Rectangle extends Shape{
	int length,width;
	Rectangle(int x,int y,String name){
		super(name);
		length=x;
		width=y;
	}
	public double area() {
		return length*width;
	}
	public void draw() {
}
}
class Circle extends Shape{
	double pi=3.14;
	int radius;
	Circle(int r,String name){
		super(name);
		radius=r;
	}
	public double area() {
		return (pi*radius*radius);
	}
	public void draw() {
		
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Shape r=new Rectangle(2,3,"Rectangle");
		System.out.println("Area of the rectangle : "+r.objectname+r.area());
		r.moveto(1,2);
		Shape c=new Circle(2,"Circle");
		System.out.println("Area of the circle : "+c.area());
		c.moveto(2, 4);
		Shape[] v=new Shape[2];
		v[0]=new Rectangle(5,6,"rect");
		v[1]=new Circle(3,"cir");
		for(int i=0;i<2;i++) {
		System.out.println("Area of the shape : "+v[i].area());
		}
	}

}
