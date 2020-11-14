package com.im.stock.bo;

import com.im.stock.dao.StockDao;
import com.im.stock.model.Stock;

public class StockBoImpl implements StockBo {
	
	StockDao stockDao;
	 
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}
 
	public StockDao getStockDao() {
		return stockDao;
	}

	//save update delete and get goes here
	@Override
	public void save(Stock stock) {
		//Business Logics Should be validated here
		stockDao.save(stock);
	}

	@Override
	public void update(Stock stock) {
		stockDao.update(stock);
	}

	@Override
	public void delete(Stock stock) {
		stockDao.delete(stock);
	}

	@Override
	public Stock findByStockCode(String stockCode) {
		return stockDao.findByStockCode(stockCode);
	}


}
