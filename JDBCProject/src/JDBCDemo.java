import java.sql.*;

//import com.mysql.cj.jdbc.CallableStatement;
public class JDBCDemo {
	public static void main(String[] args) throws SQLException {
		//JDBCDemo.ReadRecord();
		//JDBCDemo.insertRecord();
		//JDBCDemo.insertVar();
		//JDBCDemo.insertpst();
		//JDBCDemo.Delete();
		//JDBCDemo.update();
		//JDBCDemo.sp();
		//JDBCDemo.sp1();
		//JDBCDemo.sp2();
		//JDBCDemo.commitdemo();
		JDBCDemo.batchdemo();
	}
//	public static void ReadRecord() throws SQLException {
//		String url="jdbc:mysql://localhost:3306/employee";
//		String userName="root";
//		String password="root";
//		String query="select * from employeedetails";
//		
//		Connection con=DriverManager.getConnection(url, userName, password);
//		Statement st=con.createStatement();
//		ResultSet rs = st.executeQuery(query);
//		
//		 
//		while(rs.next()) {
//		System.out.println("Id is : "+rs.getInt(1));
//		System.out.println("Name is : "+rs.getString(2));
//		System.out.println("Id is : "+rs.getInt(3));
//		System.out.println("date is : "+rs.getDate(4));
//		System.out.println("City is : "+rs.getString(5));
//		}
//		con.close();
//	}
//	public static void insertRecord() throws SQLException {
//		String url="jdbc:mysql://localhost:3306/employee";
//		String userName="root";
//		String password="root";
//		String query="insert into employeedetails values (323,'venkadesh',212,'2020-01-22','chennai')";
//		
//		Connection con=DriverManager.getConnection(url, userName, password);
//		Statement st=con.createStatement();
//		int rows = st.executeUpdate(query);
//		
//		System.out.println("Number of the affected : "+rows);
//		con.close();
//	}
//	public static void insertVar() throws SQLException {
//		String url="jdbc:mysql://localhost:3306/employee";
//		String userName="root";
//		String password="root";
//		int id=325;
//		String name="vasudevan";
//		int mid=225;
//		String date="2021-02-22";
//		String city="tamil nadu";
//	
//		String query="insert into employeedetails values ("+id+",'"+name+"',"+mid+",'"+date+"','"+city+"')";
//		
//		Connection con=DriverManager.getConnection(url, userName, password);
//		Statement st=con.createStatement();
//		int rows = st.executeUpdate(query);
//		
//		System.out.println("Number of the affected : "+rows);
//		con.close();
//	}
//	public static void insertpst() throws SQLException {
//		String url="jdbc:mysql://localhost:3306/employee";
//		String userName="root";
//		String password="root";
//		int id=330;
//		String name="manula";
//		int mid=230;
//		String date="2021-03-31";
//		String city="russia";
//	
//		String query="insert into employeedetails values (?,?,?,?,?)";
//		
//		Connection con=DriverManager.getConnection(url, userName, password);
//		//Statement st=con.createStatement();
//		PreparedStatement pst=con.prepareStatement(query);
//		pst.setInt(1,id);
//		pst.setString(2, name);
//		pst.setInt(3, mid);
//		pst.setString(4, date);
//		pst.setString(5, city);
//		int rows = pst.executeUpdate();
//		
//		System.out.println("Number of the affected : "+rows);
//		con.close();
//	}
//	public static void Delete() throws SQLException {
//		String url="jdbc:mysql://localhost:3306/employee";
//		String userName="root";
//		String password="root";
//		int id=330;
//		//String city="chennai";
//		String query = "delete from employeedetails where empid="+id;
//		
//		Connection con=DriverManager.getConnection(url, userName, password);
//		Statement st=con.createStatement();
//		int rows = st.executeUpdate(query);
//		
//		System.out.println("Number of the affected : "+rows);
//		con.close();
//	}
//	public static void update() throws SQLException {
//		String url="jdbc:mysql://localhost:3306/employee";
//		String userName="root";
//		String password="root";
//		int id=323;
//	
//		String query = "update employeedetails set city='RUSSIA' where empid="+id;
//		Connection con=DriverManager.getConnection(url, userName, password);
//		Statement st=con.createStatement();
//
//		int rows = st.executeUpdate(query);
//		
//		System.out.println("Number of the affected : "+rows);
//		con.close();
//	}
//	public static void sp() throws SQLException {
//		String url="jdbc:mysql://localhost:3306/employee";
//		String userName="root";
//		String password="root";
//	
//		Connection con=DriverManager.getConnection(url, userName, password);
//		CallableStatement cst=(CallableStatement)con.prepareCall("{call Getemployee()}");
//		ResultSet rs=cst.executeQuery();
//		while(rs.next()) {
//			System.out.println("Id is : "+rs.getInt(1));
//			System.out.println("Name is : "+rs.getString(2));
//			System.out.println("Id is : "+rs.getInt(3));
//			System.out.println("date is : "+rs.getDate(4));
//			System.out.println("City is : "+rs.getString(5));
//			}
//		
//		con.close();
//	}
//	public static void sp1() throws SQLException {
//		String url="jdbc:mysql://localhost:3306/employee";
//		String userName="root";
//		String password="root";
//		int id=325;
//	
//		Connection con=DriverManager.getConnection(url, userName, password);
//		CallableStatement cst=(CallableStatement)con.prepareCall("{call Getemployeeid(?)}");
//		cst.setInt(1,id);
//		ResultSet rs=cst.executeQuery();
//		while(rs.next()) {
//			System.out.println("Id is : "+rs.getInt(1));
//			System.out.println("Name is : "+rs.getString(2));
//			System.out.println("Id is : "+rs.getInt(3));
//			System.out.println("date is : "+rs.getDate(4));
//			System.out.println("City is : "+rs.getString(5));
//			}
//		
//		con.close();
//	}
//	public static void sp2() throws SQLException {
//		String url="jdbc:mysql://localhost:3306/employee";
//		String userName="root";
//		String password="root";
//		int id=121;
//	
//		Connection con=DriverManager.getConnection(url, userName, password);
//		CallableStatement cst=(CallableStatement)con.prepareCall("{call Getname(?,?)}");
//		cst.setInt(1,id);
//		cst.registerOutParameter(2, Types.VARCHAR);
//		cst.executeQuery();
//		System.out.println(cst.getString(2));
//
//		
//		con.close();
//	}
//	public static void commitdemo() throws SQLException {
//		String url="jdbc:mysql://localhost:3306/employee";
//		String userName="root";
//		String password="root";
//		String query1="update employeedetails set city='TAMIL NADU' where empid=323";
//		String query2="update employeedetails set city='TAMIL NADU' where empid=325";
//		Connection con=DriverManager.getConnection(url,userName,password);
//		con.setAutoCommit(false);
//		Statement st=con.createStatement();
//		int rows1=st.executeUpdate(query1);
//		System.out.println("Rows affected : "+rows1);
//		int rows2=st.executeUpdate(query2);
//		System.out.println("Rows affected : "+rows2);
//		if(rows1>0 && rows2>0) {
//			con.commit();
//		}
//		con.close();
//	}
	public static void batchdemo() throws SQLException {
		String url="jdbc:mysql://localhost:3306/employee";
		String userName="root";
		String password="root";
		String query1="update employeedetails set city='TAMILNADU' where empid=323";
		String query2="update employeedetails set city='TAMILNADU' where empid=325";
		Connection con=DriverManager.getConnection(url,userName,password);
		con.setAutoCommit(false);
		Statement st=con.createStatement();
		st.addBatch(query1);
		st.addBatch(query2);
		int[] res=st.executeBatch();
		for(int i:res) {
			if(i>0) {
				System.out.println("rows affected : "+i);
				continue;
			}
			else {
				con.rollback();
			}
		}
		con.commit();
	con.close();
	}
}
