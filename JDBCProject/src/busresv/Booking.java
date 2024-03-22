package busresv;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Booking {
	String customer_name;
	String customer_email;
	int customer_phone;
	String bus_number;
	int aadhar_No;
	int age;
	String bus_name;
	int seat_number;
	Date booking_date;
	String pickup;
	String stop1;
	String stop2;
	String droping;

	Booking() {

	}

	Booking(String bus, Date booking, int[] count, String from, String stop1, String stop2, String to)
			throws NoSuchElementException, SQLException {
		Scanner s = new Scanner(System.in);
		int seat;
		BusDAO busdao = new BusDAO();
		int capacity = busdao.getCapacity(bus);
		System.out.print("Enter the customer seat_No : ");
		seat = s.nextInt();
		for (int i = 0; i < count.length; i++) {
			if (seat > capacity) {
				System.out.println("Invalid seat number in this bus");
				System.out.print("Enter the customer seat_No : ");
				seat = s.nextInt();
			}
			if (seat == count[i]) {
				System.out.println("Sorry already seat numbe booking");
				System.out.print("Enter the customer seat_No : ");
				seat = s.nextInt();
				i = -1;
			}
		}
		System.out.print("Enter the customer Name : ");
		customer_name = s.next();
		System.out.print("Enter the customer Email : ");
		customer_email = s.next();
		System.out.print("Enter the customer Phone No : ");
		customer_phone = s.nextInt();
		System.out.print("Enter the customer aadhar_NO : ");
		aadhar_No = s.nextInt();
		System.out.print("Enter the customer age : ");
		age = s.nextInt();
		bus_number = bus;
		bus_name = bus;
		seat_number = seat;
		booking_date = booking;
		pickup = from;
		this.stop1 = stop1;
		this.stop2 = stop2;
		droping = to;
	}
}
/*
 * CREATE TABLE booking_detail ( booking_id INT AUTO_INCREMENT PRIMARY KEY,
 * bus_name VARCHAR(10), customer_name VARCHAR(20), customer_email VARCHAR(50),
 * -- Increase length for email customer_phone_No VARCHAR(20),
 * customer_aadhar_No VARCHAR(20), customer_age INT, seat_number VARCHAR(10),
 * booking_date DATE, -- Change data type to DATE for dates pickup VARCHAR(50),
 * -- Increase length for pickup stop1 VARCHAR(50), -- Increase length for stops
 * stop2 VARCHAR(50), -- Increase length for stops droping VARCHAR(50), --
 * Increase length for droping FOREIGN KEY (bus_name) REFERENCES buses(bus_name)
 * );
 */
