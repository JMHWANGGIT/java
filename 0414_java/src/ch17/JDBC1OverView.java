package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC : Java Database Connect.
 * - DBMS(oracle, mySQL)의 driver 필요함. 
 * 	-> DBMS driver : DBMS 제작사(oracle)가 자신들의 DB에 접속하는 모듈을 제공한것 
 * 
 * oracle의 자바프로그램용 접속모듈은 어디에??
 * - C:\app\kotor\product\21c\dbhomeXE\jdbc\lib
 * - ojdbc8.jar : oracle java database connect driver.
 * - eclipse에 추가해야 한다. 
 * - eclipse의 project에서 오른쪽 마우스클릭 > properties 
 * > java build path > libraries > add external jars 클릭.
 */

/*
 * JDBC 코딩 : 5단계 
 * 1단계 : 오라클 접속 프로그램(driver : ojdbc8.jar를 메모리 로딩)을 실행.
 * 2단계 : DBMS 접속(통신) : ip address(위치), ip port(수신인), id, password
 * 3단계 : 접속에 성공했다면 SQL 전송
 * 4단계 : SQL 수행 결과 확인. 
 * 5단계 : 접속종료 (close())
 */

public class JDBC1OverView {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		
		//1단계 - 오라클 드라이버 로딩(driver : ojdbc8.jar)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2단계 - DBMS 접속 
		String id = "c##scott";
		String pwd = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//String url = "jdbc:orecle:thin:@localhost:1521:xe"; 
		//url은 DBMS 제조사마다 다르다.
		//ip address, ip port포함 개념.
		Connection con = DriverManager.getConnection(url, id, pwd);
		
		
		//3단계 - 접속에 성공했다면 SQL 전송
		String sql = "select * from emp"; //주의!!! sql에 ; 절대로 넣지 않는다. 
		Statement stmt = con.createStatement();
		//statement : SQL에 쿼리문을 보내기위한 메소드 
		
		//4단계 - rs : iterator와 동작방식이 유사 
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getInt("empno")+"\t");
			System.out.print(rs.getString("ename")+"\t");
			System.out.print(rs.getString("job")+"\t");
			System.out.print(rs.getInt("mgr")+"\t");
			System.out.print(rs.getString("hiredate")+"\t");
			System.out.print(rs.getInt("sal")+"\t");
			System.out.print(rs.getInt("comm")+"\t");
			System.out.println(rs.getInt("deptno"));
		}//while
		
		//5단계 
		rs.close();
		stmt.close();
		con.close();
	}//main
}//class
