package com.example.Ekartstore.Controller;

import java.sql.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/authuser")
    public String authenticateUser(
            @RequestParam("username") String userName,
            @RequestParam("password") String password) {

        String dbUrl = "jdbc:mysql://localhost:3306/User";
        String dbUser = "root";
        String dbPass = "rootpassword";

        String query = "SELECT * FROM user_info WHERE user_name = ? AND password = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, userName);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return "Login successful for user: " + userName;
            } else {
                return "Invalid credentials for user: " + userName;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "Internal server error: " + e.getMessage();
        }
    }
}
