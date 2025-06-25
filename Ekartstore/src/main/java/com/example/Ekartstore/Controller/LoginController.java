package com.example.Ekartstore.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/login")
public class LoginController {
	@RequestMapping("/authuser")
   public String authanticateuser(@RequestParam("username") String userName,@RequestParam("password") String password) throws SQLException {
	  System.out.println("Authenticating");
	  try {
		  String Query="select * from user_details";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
			    "jdbc:mysql://localhost:3306/store", "root", "root");
		PreparedStatement ps = con.prepareStatement(Query);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
		    System.out.println("user_id: " + rs.getString("user_id")+"password: " + rs.getString("password"));
		}

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} 
	   return "auth";
	   
	   
   }
}