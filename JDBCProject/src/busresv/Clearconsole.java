package busresv;

import java.text.ParseException;
import java.util.NoSuchElementException;
import java.util.Date;
import java.util.Scanner;

public class Clearconsole  {
	String bus_name;
	int seat_number;
	Date booking_date;
	String pickup;
	String droping;
	Clearconsole(String from,String to,Date bookingdate) throws ParseException,NoSuchElementException{
		Scanner scanner=new Scanner(System.in);
	        System.out.print("Enter the bus name : ");
	        bus_name=scanner.next();
	        System.out.print("Enter the seat number : ");
			seat_number=scanner.nextInt();
	        booking_date=bookingdate;
			pickup=from;
			droping=to;
			scanner.close();
}
}


