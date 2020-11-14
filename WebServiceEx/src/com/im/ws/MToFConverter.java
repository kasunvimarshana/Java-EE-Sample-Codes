package com.im.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class MToFConverter {

	@WebMethod
	public double convert(double m){
		double f = m * 1.5;
		return m;
	}
	
}
