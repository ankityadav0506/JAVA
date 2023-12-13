package com.myapp.web.dao;

import com.myapp.web.model.Students;
import java.sql.*;
public class StudentsDao {
	public Students getStudents(int sid) {
		Students s = new Students();
		s.setSid(1);
		s.setSname("Ankit");
		s.setTech("Java");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "mysql");
			Statement st = conn.createStatement();
			ResultSet rs =  st.executeQuery("select * from student where id = "+ sid);
			
			if(rs.next()) {
				s.setSid(rs.getInt("id"));
				s.setSname(rs.getString("sname"));
				s.setTech(rs.getString("techstack"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return s;
	}
}
