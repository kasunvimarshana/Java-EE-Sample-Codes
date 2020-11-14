package com.im.myframework.test;

import com.im.myframework.Dao;

public class Demo {

	public static void main(String args[]){
		Expense ex = new Expense();
		ex.id = 1;
		ex.reason = "Flood";
		ex.amount = 45.0;
		ex.date = "2017-04-23";
		
		try{
			String sql = Dao.getSaveSQL(ex);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
