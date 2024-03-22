package busresv;

import java.sql.SQLException;
import java.util.Date;

public class busSeating {
	public boolean seatdetails(String bus_name, Date booking_date, int b_seat, String from,String stop1,String stop2) throws SQLException {
		BusDAO busdeo = new BusDAO();
		BookingDAO bookingdao = new BookingDAO();
		int capacity = busdeo.getCapacity(bus_name);
		int booked = bookingdao.getBookedCount(bus_name, booking_date, from,stop1,stop2);

		if (booked < capacity) {
			int i = capacity - booked;
			System.out.println("Total number of balance seat : " + i);
		}
		return (capacity - booked >= b_seat) ? true : false;
	}

	public int[] booking(String bus_name, Date booking_date, String from,String stop1,String stop2) throws SQLException {
		BusDAO busdeo = new BusDAO();
		BookingDAO bookingdao = new BookingDAO();
		int capacity = busdeo.getCapacity(bus_name);
		int count[]= bookingdao.seatbooking(capacity, booking_date, bus_name, from,stop1,stop2);
		return count;
	}
}


