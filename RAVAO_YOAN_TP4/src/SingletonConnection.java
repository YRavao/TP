import java.sql.*;


public class SingletonConnection {
	private static Connection connection;
	
	static{
		try{
			Class.forName("com.mysql.jdoc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_","root","");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnetion(){
		return connection;
	}
}
