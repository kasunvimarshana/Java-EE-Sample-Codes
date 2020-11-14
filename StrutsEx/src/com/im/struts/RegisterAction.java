package com.im.struts;

public class RegisterAction {

	public String name;
	public String email;
	public String phone;
	public String pw;
	
	public String reg(){
		
		try{
			System.out.println("Name = " + name);
			System.out.println("E-mail = " + email);
			System.out.println("Phone = " + phone);
			System.out.println("Password = " + pw);
			return "success";
		}catch(Exception e){
			return "failed";
		}
		
	}
	
}
