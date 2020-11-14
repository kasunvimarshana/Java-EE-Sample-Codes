package com.im.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculator {

	@WebMethod
	public double add(double a, double b){
		double total = (a+b) * 1.15;
		System.out.println("total = " + total);
		return total;
	}
	
	@WebMethod
	public double substrsct(double a, double b){
		double result = (a-b);
		return result;
	}
	
}

/*
 * right click file -> web services -> create web service
 *  1) - bottom up java bean web service -> create wsdl(web service description language) xml from java class
 *  2) - top down java bean web service -> create java class from wsdl(web service description language) xml
 * next and finish
 * 
 * now web service started at JAX-WS Web Service
 * url -> http://localhost:8080/WebServiceEx/services/Calculator
 * wsdl url -> http://localhost:8080/WebServiceEx/services/Calculator?wsdl (url + ?wsdl)
 */