package BUSREV;
import java.text.ParseException;
import java.util.*;
public class BusDemo {

	public static void main(String[] args) throws ParseException {
		
		ArrayList <Bus> buses =new ArrayList <Bus>();
		ArrayList <Booking> bookings =new ArrayList <Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,3));
		buses.add(new Bus(3,true,1));
		
		int userOpt=1;
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		for(Bus b:buses) {
			b.displayBusInfo();			
			}
		while(userOpt==1) {
			//Booking booking= new Booking();
			System.out.print("Enter 1 to Book and 2 to exit : ");
			userOpt=scanner.nextInt();
			if(userOpt==1) {
				Booking booking= new Booking();
				if(booking.isAvailable(buses,bookings)) {
					bookings.add(booking);
					System.out.println("your booking is confirmed");
				}
				else
					System.out.println("sorry bus is full");
			}
			else
				System.out.println("Exit");
		}
	}

}
