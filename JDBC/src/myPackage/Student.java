package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Student {
	
	public void createDatabase() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String username = "root";
			String password = "mysql";
	//		Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stm = conn.createStatement();
			System.out.println("Connected Successfully");
			
			String query = "create database Students";
			stm.execute(query);
			System.out.println("Data created succesfully");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createTable() {
		try {
			String url = "jdbc:mysql://localhost:3306/students";
			String username = "root";
			String password = "mysql";
	//		Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stm = conn.createStatement();
			System.out.println("Connected Successfully");
			
			String query = "create table student (id int(3), sname varchar(255), email varchar(255))";
			stm.execute(query);
			System.out.println("Table created succesfully");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	public void createData() {
		try {
			String url = "jdbc:mysql://localhost:3306/students";
			String username = "root";
			String password = "mysql";
			
			//Method 1 , not suited
//			Connection conn = DriverManager.getConnection(url, username, password);
//			Statement stm = conn.createStatement();
//			System.out.println("Connected Successfully");
//			String query = "insert into student (id,sname, email) values (2, 'Sam', 'sam@gmail.com')";
//			stm.execute(query);
//			System.out.println("Data insrted succesfully");
//			conn.close();
			
			//Method 2
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected Successfully");

			String query = "insert into student (id,sname, email) values (?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, 3);
			pstm.setString(2, "John");
			pstm.setString(3, "john@gmail.com");
			
			pstm.execute();
			System.out.println("Data insrted succesfully");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	public void readData() {
		try {
			String url = "jdbc:mysql://localhost:3306/students";
			String username = "root";
			String password = "mysql";
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected Successfully");
			
			Statement stm = conn.createStatement();
			String query = "select * from student";
			
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				System.out.println("id = "+ rs.getInt(1));
				System.out.println("name = "+ rs.getString(2));
				System.out.println("email = "+ rs.getString(3));
			}
			System.out.println("Read succesfully");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	public void updateData() {
		try {
			String url = "jdbc:mysql://localhost:3306/students";
			String username = "root";
			String password = "mysql";
			
			//Method 2
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected Successfully");

			String query = "update student set id=? where sname=?";
			PreparedStatement pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, 4);
			pstm.setString(2, "John");
			pstm.execute();
			System.out.println("Data updated succesfully");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	public void deleteData() {
		try {
			String url = "jdbc:mysql://localhost:3306/students";
			String username = "root";
			String password = "mysql";
			
			//Method 2
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected Successfully");

			String query = "delete from student where id=?";
			PreparedStatement pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, 4);
			pstm.execute();
			System.out.println("Data deleted succesfully");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
