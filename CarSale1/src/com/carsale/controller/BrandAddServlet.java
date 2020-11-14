package com.carsale.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carsale.controller.DB;

@WebServlet("/addBrand")
public class BrandAddServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException{
		
		String name = request.getParameter("name");
		
		try{
			String sql = "INSERT INTO brand (name) VALUES (?)";
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.executeUpdate();
			response.sendRedirect("brand_list.jsp");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
