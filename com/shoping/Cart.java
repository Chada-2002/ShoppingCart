package com.shoping;

import java.util.Objects;

public class Cart {
	private String custid;
	private String prodid;
	private int price;
	private int qty;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(String custid, String prodid, int price, int qty) {
		super();
		this.custid = custid;
		this.prodid = prodid;
		this.price = price;
		this.qty = qty;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public int hashCode() {
		return Objects.hash(custid, price, prodid, qty);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return Objects.equals(custid, other.custid) && price == other.price && Objects.equals(prodid, other.prodid)
				&& qty == other.qty;
	}
	
	
	

}
