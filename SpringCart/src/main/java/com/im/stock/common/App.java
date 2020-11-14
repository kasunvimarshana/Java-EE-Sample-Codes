package com.im.stock.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.im.stock.bo.StockBo;
import com.im.stock.model.Stock;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

		StockBo stockBo = (StockBo) appContext.getBean("stockBo");

		/** insert **/
		Stock stock = new Stock();
		stock.setStockCode("1001");
		stock.setStockName("Sunlight");
		stockBo.save(stock);

	}

}
