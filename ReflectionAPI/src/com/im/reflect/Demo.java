package com.im.reflect;

public class Demo {

	public static void main(String args[]){
		Girl g1 = new Girl();
		g1.name = "Juliet";
		g1.age = 25;
		Analyzer.analyze(g1);
	}
	
}
