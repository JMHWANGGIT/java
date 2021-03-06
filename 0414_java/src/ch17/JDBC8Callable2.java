package ch17;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class JDBC8Callable2 {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);

		String sql = "{? = call func_calc(?,?,?)}";
		CallableStatement csmt = con.prepareCall(sql);
		csmt.registerOutParameter(1, Types.INTEGER);//1;
		csmt.setInt(2, 7);//2;
		csmt.setString(3, "+");//3;
		csmt.setInt(4, 8);//4;
		
		csmt.executeUpdate();
		int res = csmt.getInt(1);
		System.out.println("res :" + res);
		
		csmt.close();
		con.close();
		
	}//main
}//class
