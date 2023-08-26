package com.orderservice;

public class Order {
	
	long id;
	String detail;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", detail=" + detail + "]";
	}
	public Order(long id, String detail) {
		super();
		this.id = id;
		this.detail = detail;
	}
	public Order() {
		super();
	}
	
	

}
