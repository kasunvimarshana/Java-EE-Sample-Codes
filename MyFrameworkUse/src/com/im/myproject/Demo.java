package com.im.myproject;

import java.sql.PreparedStatement;

import com.im.myframework.Dao;

public class Demo {

	public static void main(String[] args){
		User u = new User();
		u.user_id = 1;
		u.user_name = "name";
		u.user_address = "address";
		u.user_email = "email";
		u.user_password = "password";
		u.user_full_name = "full name";
		u.user_nic = "nic";
		u.user_phone = "phone";
		
		try{
			String sql = Dao.getSaveSQL(u);
			PreparedStatement ps = DB.getConnection().prepareStatement(sql);
			ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
