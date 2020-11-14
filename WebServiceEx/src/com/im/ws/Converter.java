package com.im.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class Converter {

	@WebMethod
	//convert cm to inch
	public double cmToInch(double a){
		return a * 0.393701;
	}
	
}
