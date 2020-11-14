package com.carsale.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carsale.controller.DB;

@WebServlet("/car_save")
public class CarSaveSevlet extends HttpServlet{

	@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response){
		
		String name = request.getParameter("name");
		String brand = request.getParameter("brand");
		String milage = request.getParameter("milage");
		String price = request.getParameter("price");
		String date = request.getParameter("date");
		String description = request.getParameter("description");
		String photo = request.getParameter("photo");
		HttpSession session = request.getSession();
		String member = session.getAttribute("id").toString();
		
		try{
			
			String sql = "INSERT INTO car(title, description, brand_id, year, milage, price, member, photo) VALUES (?,?,?,?,?,?,?,?)";
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, description);
			ps.setString(3, brand);
			ps.setString(4, date);
			ps.setString(5, milage);
			ps.setString(6, price);
			ps.setString(7, member);
			ps.setString(8, photo);
			
			ps.executeUpdate();
			response.sendRedirect("index.jsp");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
