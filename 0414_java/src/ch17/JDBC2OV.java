package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2OV {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		//1단계 : 오라클이 제공한 접속프로그램을 자바 메모리에 로딩한다.
		//Class.forName : 이름으로 클래스 파일을 찾아서 메모리에 로딩하는 메소드. 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2단계 : 오라클이 제공한 방법으로 접속.(IP addres, port, id/pwd)
		String id = "c##scott", pwd = "tiger" ; 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url,id,pwd);
		//3단계 : 질의전송(Query(sql)전송)
		//Statement : sql을 담는 그릇. (전송바구니 : 바구니로 받고 바구니째로 던진다.) 
		Statement stmt = con.createStatement();
		String sql = "select empno, ename, job, sal, deptno from emp";
		ResultSet rs = stmt.executeQuery(sql);
		//4단계 : 결과확인 
		while(rs.next()) {
//			System.out.print(rs.getInt(1)+ " ");
//			System.out.print(rs.getString(2)+ " ");
//			System.out.print(rs.getString(3)+ " ");
//			System.out.print(rs.getInt(4)+ " ");
//			System.out.println(rs.getInt(5)+ " ");
			
			System.out.print(rs.getString("empno")+ " ");
			System.out.print(rs.getString("ename")+ " ");
			System.out.print(rs.getString("job")+ " ");
			System.out.print(rs.getString("sal")+ " ");
			System.out.println(rs.getString("deptno")+ " ");
			
		}//while
		//5단계 : 접속해제 
		rs.close();
		stmt.close();
		con.close();
		
	}//main
}//class
