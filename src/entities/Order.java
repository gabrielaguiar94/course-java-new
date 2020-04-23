package entities;

import java.sql.Date;

public class Order {
	
	private Date date;
	private ProductTV product;
	public Order(Date date, ProductTV product) {
		super()	;
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ProductTV getProduct() {
		return product;
	}
	public void setProduct(ProductTV product) {
		this.product = product;
	}
	
	
	
	
	

}
