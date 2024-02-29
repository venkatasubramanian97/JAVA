package busresv;

import java.util.Date;
import java.util.NoSuchElementException;
import java.sql.*;

public class BookingDAO {
	public int getBookedCount(String bus_name, Date date, String from,String stop1,String stop2) throws SQLException {
		String query = "select count(customer_name) from booking_detail where bus_name=? and booking_date=? and pickup in(?,?,?)";
		Connection con = DBConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setString(1, bus_name);
		pst.setDate(2, sqldate);
		pst.setString(3, from);
		pst.setString(4, stop1);
		pst.setString(5, stop2);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}

	public int[] seatbooking(int capacity, Date date, String bus_name, String from,String stop1,String stop2) throws SQLException {
		int k = 0;
		String query = "select seat_number from booking_detail where booking_date=?and bus_name=?and pickup in(?,?,?)order by seat_number asc";
		Connection con = DBConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setDate(1, sqldate);
		pst.setString(2, bus_name);
		pst.setString(3, from);
		pst.setString(4, stop1);
		pst.setString(5, stop2);
		ResultSet rs = pst.executeQuery();
		System.out.println("AVAIABLE SEAT_NO : ");
		int[] array = new int[capacity];
		int[] arr = new int[capacity];
		while (rs.next()) {
			array[k] = rs.getInt(1);
			k++;
		}
		System.out.print("\n");
		k = 0;
		for (int i = 0; i < array.length; i++) {
			arr[i] = i + 1;
			if (arr[i] == array[k]) {
				System.out.print("#");
				k++;
			} else
				System.out.print(arr[i]);
			System.out.print(" ");
			if (arr[i] % 2 == 0)
				System.out.print("\t");
			if (arr[i] % 4 == 0)
				System.out.print("\n");

		}
		return array;
	}

	public void addBooking(Booking booking) throws SQLException {
		String query = "insert into booking_detail values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection con = DBConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(booking.booking_date.getTime());
		pst.setString(1, null);
		pst.setString(2, booking.bus_name);
		pst.setString(3, booking.customer_name);
		pst.setString(4, booking.customer_email);
		pst.setInt(5, booking.customer_phone);
		pst.setInt(6, booking.aadhar_No);
		pst.setInt(7, booking.age);
		pst.setInt(8, booking.seat_number);
		pst.setDate(9, sqldate);
		pst.setString(10, booking.pickup);
		pst.setString(11, booking.stop1);
		pst.setString(12, booking.stop2);
		pst.setString(13, booking.droping);
		pst.executeUpdate();
	}

	public int getBooked(String bus_name, Date date, String from, String to) throws SQLException,NoSuchElementException {
		String query = "select count(customer_name) from booking_detail where bus_name=? and booking_date=? and pickup=? and droping=?";
		Connection con = DBConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setString(1, bus_name);
		pst.setDate(2, sqldate);
		pst.setString(3, from);
		pst.setString(4, to);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}

	public void CancellTicket(Clearconsole console) throws SQLException,NoSuchElementException {
		String query = "delete from booking_detail where bus_name=? and booking_date=? and seat_number=? and pickup=? and droping=?";
		Connection con = DBConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(console.booking_date.getTime());
		pst.setString(1, console.bus_name);
		pst.setDate(2, sqldate);
		pst.setInt(3, console.seat_number);
		pst.setString(4, console.pickup);
		pst.setString(5, console.droping);
		pst.executeUpdate();
	}

}
