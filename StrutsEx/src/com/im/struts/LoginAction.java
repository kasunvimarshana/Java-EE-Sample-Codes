package com.im.struts;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	//OGNL (Object Graphic Notational Language) variables
	
	public String un;
	public String pw;
	
	/*public String execute(){//default execution method
		
		System.out.println("Authentication ..........");
		
		if(un.equals("admin") && pw.equals("123")){
			return "success";
		}else{
			return "failed";
		}
		
	}*/
	
@Override
public void validate(){//a method comes from ActionSupport class
	if(un.length() < 5){
		addFieldError("un", "User Name must have 5 charactors minimum.");
		//addFieldError(field / variable name, error message);
	}
}
	
public String auth(){
		
		System.out.println("Authentication ..........");
		
		if(un.equals("admin") && pw.equals("123")){
			return SUCCESS;
		}else{
			return ERROR;
		}
		
	}
	
}
