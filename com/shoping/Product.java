package com.shoping;

import java.util.Objects;

public class Product {

	private String prodid;
	private String prodname;
	private String category;
	private int price;
	private int Qoh;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String prodid, String prodname, String category, int price, int qoh) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.category = category;
		this.price = price;
		Qoh = qoh;
	}
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQoh() {
		return Qoh;
	}
	public void setQoh(int qoh) {
		Qoh = qoh;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Qoh, category, price, prodid, prodname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Qoh == other.Qoh && Objects.equals(category, other.category) && price == other.price
				&& Objects.equals(prodid, other.prodid) && Objects.equals(prodname, other.prodname);
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodname=" + prodname + ", category=" + category + ", price=" + price
				+ ", Qoh=" + Qoh + "]";
	}
	
	
	
}
