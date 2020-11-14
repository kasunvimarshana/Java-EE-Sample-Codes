package com.im.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;

import com.im.ws.db.DB;
import java.sql.Statement;
import java.sql.ResultSet;

@WebService
public class Car {

	@WebMethod
	public String getTitleById(int id){
		String title = "";
		String sql = "SELECT * FROM car WHERE id = '"+id+"'";
		try{
			Statement stmt = DB.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()){
				title = rs.getString("title");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return title;
	}
	
}
