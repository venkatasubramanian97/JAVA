
package busresv;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BusDemo {
	public static void main(String[] args) throws SQLException, ParseException,NoSuchElementException, IOException {
		String bus_name;
		Date booking_date;
		String from;
		String to;
		String stop1;
		String stop2;
		System.out.println("\t\t\t**********SRI TRAVELs**********");

		System.out.println("Enter 1 to Booking Ticket : ");
		System.out.println("Enter 2 to Booking Ticket is CANCELL : ");
		System.out.println("Enter 0 to exit : ");
		System.out.print("select your choose : ");

		Scanner scanner = new Scanner(System.in);
		int userOpt = scanner.nextInt();

			System.out.println("Enter the pickup bus stop");
			System.out.print("1=Kelambakkam \t 2=Tiruchchirappalli \t 3=Madurai\t : ");
			int pickup = scanner.nextInt();
			if (1 == pickup)
				from = "Kelambakkam";
			else if (2 == pickup)
				from = "Tiruchchirappalli";
			else
				from = "Madurai";
			if (from.equals("Kelambakkam")) {
				System.out.println("\nEnter the drop bus stop");
				System.out.print("1=Tiruchchirappalli \t 2=Madurai \t 3=Tirunelveli\t : ");
			} else if (from.equals("Tiruchchirappalli")) {
				System.out.println("\nEnter the drop bus stop");
				System.out.print("2=Madurai \t 3=Tirunelveli\t : ");
			} else {
				System.out.println("\nEnter the drop bus stop");
				System.out.print("3=Tirunelveli\t : ");
			}
			int droping = scanner.nextInt();
			if (1 == droping)
				to = "Tiruchchirappalli";
			else if (2 == droping)
				to = "Madurai";
			else
				to = "Tirunelveli";

			System.out.print("\nEnter the booking date (dd-MM-yyyy) : ");
			String dateInput = scanner.next();
			SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
			booking_date = dateformat.parse(dateInput);

			if (from.equals("Kelambakkam") && to.equals("Tiruchchirappalli")) {
				BusDAO busdao = new BusDAO();
				busdao.KelambakkamTOTiruchchirappalli();
				stop1 = null;
				stop2 = null;
			} else if (from.equals("Kelambakkam") && to.equals("Madurai")) {
				BusDAO busdao = new BusDAO();
				busdao.KelambakkamTOMadurai();
				stop1 = "Tiruchchirappalli";
				stop2 = null;
			} else if (from.equals("Kelambakkam") && to.equals("Tirunelveli")) {
				BusDAO busdao = new BusDAO();
				busdao.KelambbakamTOTirunelveli();
				stop1 = "Tiruchchirappalli";
				stop2 = "Madurai";
			} else if (from.equals("Tiruchchirappalli") && to.equals("Madurai")) {
				BusDAO busdao = new BusDAO();
				busdao.TiruchiTOMadurai();
				stop1 = null;
				stop2 = null;
			} else if (from.equals("Tiruchchirappalli") && to.equals("Tirunelveli")) {
				BusDAO busdao = new BusDAO();
				busdao.TiruchiTOTirunelveli();
				stop1 = "Madurai";
				stop2 = null;
			} else {
				BusDAO busdao = new BusDAO();
				busdao.MaduraiTOTirunelveli();
				stop1 = null;
				stop2 = null;
			}

			if (userOpt == 1) {
				int i;
				System.out.print("Choose your bus name : ");
				bus_name = scanner.next();
				busSeating seating = new busSeating();
				System.out.print("How many ticket booking : ");
				int b_seat = scanner.nextInt();
				if (seating.seatdetails(bus_name, booking_date, b_seat, from, stop1, stop2)) {
					for (i = 0; i < b_seat; i++) {
						int count[] = seating.booking(bus_name, booking_date, from, stop1, stop2);
						Booking book = new Booking(bus_name, booking_date, count, from, stop1, stop2, to);
						BookingDAO bookingdao = new BookingDAO();
						bookingdao.addBooking(book);
						System.out.println("your booking is confirmed");
					}
				} else
					System.out.println("Sorry bus is full");
			}

			if (userOpt == 2) {
				Clearconsole console = new Clearconsole(from, to, booking_date);
				BookingDAO bookingdao = new BookingDAO();
				int total = bookingdao.getBooked(console.bus_name, booking_date, from, to);
				bookingdao.CancellTicket(console);
				int count = bookingdao.getBooked(console.bus_name, booking_date, from, to);
				if (total != count)
					System.out.println("your booking Ticket is cancell");
				else
					System.out.println("Sorry your details wrong");
			}

		if (userOpt == 0)
			System.out.println("Exit");

		scanner.close();

	}
}
