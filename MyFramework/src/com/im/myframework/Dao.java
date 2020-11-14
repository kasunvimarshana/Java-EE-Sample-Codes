package com.im.myframework;

import java.lang.reflect.Field;

public class Dao {

	public static String getSaveSQL(Object object) throws Exception{
		String sql = "";
		Class cls = object.getClass();
		String tableName = cls.getSimpleName().toLowerCase();
		
		String fieldSet = "";
		String valueSet = "";
		
		Field[] fields = cls.getDeclaredFields();
		for(Field field : fields){
			fieldSet += field.getName()+",";
			valueSet += "'"+field.get(object).toString()+"',";
		}
		
		fieldSet = fieldSet.substring(0, fieldSet.length()-1);
		valueSet = valueSet.substring(0, valueSet.length()-1);
		
		sql = "INSERT INTO "+tableName+" ("+fieldSet+") VALUES ("+valueSet+")";
		
		System.out.println(sql);
		return sql;
	}
	
}
