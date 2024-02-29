package BUSREV;

public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap){
		this.busno=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public boolean getAc() {
		return ac;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setAc(boolean val) {
		ac=val;
	}
	public void setCapacity(int cap) {
		capacity=cap;
	}
	public void displayBusInfo() {
		System.out.println("Bus no : "+busno+" "+"AC : "+ac+" "+"Total capacity : "+capacity);
	}
	public int getBusNo() {
		// TODO Auto-generated method stub
		return busno;
	} 
}
