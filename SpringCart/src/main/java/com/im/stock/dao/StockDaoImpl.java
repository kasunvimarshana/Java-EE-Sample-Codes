package com.im.stock.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.im.stock.model.Stock;

public class StockDaoImpl extends HibernateDaoSupport implements StockDao {

	// Update and Delete goes here
	@Override
	public void save(Stock stock) {
		getHibernateTemplate().save(stock);
	}

	@Override
	public void update(Stock stock) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Stock stock) {
		// TODO Auto-generated method stub
	}

	@Override
	public Stock findByStockCode(String stockCode) {
		List list = getHibernateTemplate().find("from Stock where stockCode=?", stockCode);
		return (Stock) list.get(0);
	}
}
