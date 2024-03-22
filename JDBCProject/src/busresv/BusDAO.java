package busresv;

import java.sql.*;

public class BusDAO {
	public void KelambakkamTOTiruchchirappalli() throws SQLException {
		String query = "select  b.bus_name,b.bus_number,b.bus_type,b.capacity,k.departure_time,k.arrival_time\r\n"
				+ "from buses as b left join KelamTOTiruchi as k on b.bus_id=k.bus_id";
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("Bus_name : " + rs.getString(1));
			System.out.println("Bus_number : " + rs.getString(2));
			System.out.println("Bustype : " + rs.getString(3));
			System.out.println("Capacity : " + rs.getInt(4));
			System.out.println("Departure_time : " + rs.getString(5));
			System.out.println("Arrival_time : " + rs.getString(6));
			System.out.println("*********************************");
		}
		System.out.println("-----------------------------------");
	}

	public void KelambakkamTOMadurai() throws SQLException {
		String query = "SELECT b.bus_name,b.bus_number,b.bus_type,b.capacity,k.departure_time,t.arrival_time\r\n"
				+ "FROM buses AS b LEFT JOIN KelamTOTiruchi AS k ON b.bus_id = k.bus_id\r\n"
				+ "LEFT JOIN TiruchiTOMadurai AS t ON k.bus_id = t.bus_id";
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("Bus_name : " + rs.getString(1));
			System.out.println("Bus_number : " + rs.getString(2));
			System.out.println("Bustype : " + rs.getString(3));
			System.out.println("Capacity : " + rs.getInt(4));
			System.out.println("Departure_time : " + rs.getString(5));
			System.out.println("Arrival_time : " + rs.getString(6));
			System.out.println("*********************************");
		}
		System.out.println("-----------------------------------");
	}

	public void KelambbakamTOTirunelveli() throws SQLException {
		String query = "SELECT b.bus_name,b.bus_number,b.bus_type,b.capacity,k.departure_time,m.arrival_time\r\n"
				+ "FROM buses AS b LEFT JOIN KelamTOTiruchi AS k ON b.bus_id = k.bus_id\r\n"
				+ "LEFT JOIN  MaduraiTOTirunelveli AS m ON k.bus_id = m.bus_id";
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("Bus_name : " + rs.getString(1));
			System.out.println("Bus_number : " + rs.getString(2));
			System.out.println("Bustype : " + rs.getString(3));
			System.out.println("Capacity : " + rs.getInt(4));
			System.out.println("Departure_time : " + rs.getString(5));
			System.out.println("Arrival_time : " + rs.getString(6));
			System.out.println("*********************************");
		}
		System.out.println("-----------------------------------");
	}

	public void TiruchiTOMadurai() throws SQLException {
		String query = "select b.bus_name,b.bus_number,b.bus_type,b.capacity,t.departure_time,t.arrival_time\r\n"
				+ "from buses as b left join TiruchiTOMadurai as t on t.bus_id=b.bus_id";
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("Bus_name : " + rs.getString(1));
			System.out.println("Bus_number : " + rs.getString(2));
			System.out.println("Bustype : " + rs.getString(3));
			System.out.println("Capacity : " + rs.getInt(4));
			System.out.println("Departure_time : " + rs.getString(5));
			System.out.println("Arrival_time : " + rs.getString(6));
			System.out.println("*********************************");
		}
		System.out.println("-----------------------------------");
	}

	public void TiruchiTOTirunelveli() throws SQLException {
		String query = "SELECT b.bus_name,b.bus_number,b.bus_type,b.capacity,t.departure_time,m.arrival_time\r\n"
				+ "FROM buses AS b\r\n" + "LEFT JOIN TiruchiTOMadurai AS t ON b.bus_id = t.bus_id\r\n"
				+ "LEFT JOIN  MaduraiTOTirunelveli AS m ON t.bus_id = m.bus_id;";
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("Bus_name : " + rs.getString(1));
			System.out.println("Bus_number : " + rs.getString(2));
			System.out.println("Bustype : " + rs.getString(3));
			System.out.println("Capacity : " + rs.getInt(4));
			System.out.println("Departure_time : " + rs.getString(5));
			System.out.println("Arrival_time : " + rs.getString(6));
			System.out.println("*********************************");
		}
		System.out.println("-----------------------------------");
	}

	public void MaduraiTOTirunelveli() throws SQLException {
		String query = "select b.bus_name,b.bus_number,b.bus_type,b.capacity,m.departure_time,m.arrival_time \r\n"
				+ "from buses as b left join MaduraiTOTirunelveli as m on b.bus_id=m.bus_id";
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("Bus_name : " + rs.getString(1));
			System.out.println("Bus_number : " + rs.getString(2));
			System.out.println("Bustype : " + rs.getString(3));
			System.out.println("Capacity : " + rs.getInt(4));
			System.out.println("Departure_time : " + rs.getString(5));
			System.out.println("Arrival_time : " + rs.getString(6));
			System.out.println("*********************************");
		}
		System.out.println("-----------------------------------");
	}

	public int getCapacity(String bus_name) throws SQLException {
		String query = "select capacity from buses where bus_name= ?";
		Connection con = DBConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, bus_name);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
}
