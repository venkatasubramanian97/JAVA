package BUSREV;
import java.util.*;
import java.text.*;
public class Booking {
String passengerName;
int busNo;
Date date;
Booking() throws ParseException{
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter name of passenger : ");
	passengerName=scanner.next();
	System.out.print("Enter bus number : ");
	busNo=scanner.nextInt();
	System.out.print("Enter date dd-mm-yyyy : ");
	String dateInput=scanner.next();
	SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
	date=dateformat.parse(dateInput);
}
public boolean isAvailable(ArrayList <Bus> buses,ArrayList <Booking> bookings) {
	int capacity=0;
	for(Bus bus:buses) {
		if(bus.getBusNo()==busNo)
			capacity=bus.getCapacity();
	}
	int booked=0;
	for(Booking b:bookings) {
		if(b.busNo==busNo&&b.date.equals(date))
			booked++;
	}
	//boolean ture;
	return booked<capacity?true:false;
		
}


}
