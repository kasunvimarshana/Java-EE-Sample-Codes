package com.carsale.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carsale.controller.DB;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
protected void doPost(HttpServletRequest request, HttpServletResponse response){
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tp = request.getParameter("tp");
		String pw = request.getParameter("pw");
		String confirm = request.getParameter("confirm");
		
		try{
			
			String sql = "INSERT INTO member(name, email, password, tp) VALUES (?,?,?,?)";
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, tp);
			ps.setString(4, pw);
			
			ps.executeUpdate();
			response.sendRedirect("register_thankyou.jsp");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
