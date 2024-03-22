package OOPS;
enum Level{
	BEGINNER("B"), INTERMEDIATE("I"), ADVANCED("A");
	private String abbr;
	Level(String ab){
		abbr=ab;
	}
	String getabbr() {
		return abbr;
	}
}
public class EnumDemo {

	public static void main(String[] args) {
		Level l1=Level.ADVANCED;
		System.out.println(l1);
		System.out.println(l1.ordinal());
		System.out.println(l1.toString());
		System.out.println(l1.getabbr());	 
		}

}
