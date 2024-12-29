package com.shoping;

import java.util.ArrayList;
import java.util.List;

public class CartUtility {
	
	public static List<Cart> cartList = new ArrayList<>();

	public static void addProductToCart(Cart cart) {
		
	
	    int index = -1;
	    Cart temp = null;

	    for (Cart c : cartList) {
	        index++;
	        if (c.getCustid() != null && cart.getCustid() != null &&
	            c.getCustid().equals(cart.getCustid()) &&
	            c.getProdid() != null && cart.getProdid() != null &&
	            c.getProdid().equals(cart.getProdid())) {
	            temp = c;
	            break;
	        
	        /*
	            if (c.getCustid().equals(cart.getCustid()) && c.getProdid().equals(cart.getProdid())) {
	                temp = c; // Found existing cart item
	                break;
	        }*/
	    }
	    }
	
	    if (temp == null) {
	        cartList.add(cart);
	        System.out.println("Cart Added");
	    } else {
	        temp.setQty(temp.getQty() + cart.getQty());
	      
	        cartList.set(index, temp);
	        System.out.println("Cart Updated....");
	    }
	
	
	//decrease the stock for particular prodid, that is added to cart
	
	// we need to find the Product Object from the product list 
	
	//based on the prodid that is added to the cart
	
	    Product p = ProductUtility.findProduct(cart.getProdid());
	    
	        p.setQoh(p.getQoh() - cart.getQty());
	
	
	
	}
	}



