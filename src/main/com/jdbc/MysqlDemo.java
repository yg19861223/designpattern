package main.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDemo {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://192.168.2.157:3306/chronic?"
                + "user=root&password=langtong&useUnicode=true&characterEncoding=UTF8");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM bs_customer_info");
			while(rs.next()){
			System.out.println(rs.getString(1)+" | "+ rs.getString(2));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
            conn.close();
        }

	}

}
