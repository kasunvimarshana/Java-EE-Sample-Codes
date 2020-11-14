package org.idex.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Invoice {

	@Id @GeneratedValue
	private int id;
	@Temporal (TemporalType.DATE)
	private Date date;
	@ElementCollection
	@JoinTable (name="product_list" )
	@GenericGenerator (name="hilo-gen",strategy="hilo")
	@CollectionId (columns={@Column (name="product_id")},
	generator="hilo-gen", type=@Type (type="long"))

	List<Product> productList = new ArrayList<Product>();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
}
