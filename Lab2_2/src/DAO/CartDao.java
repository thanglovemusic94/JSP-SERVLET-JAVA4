package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import BEAN.Cart;
import BEAN.Product;

public class CartDao extends HashMap{

	public void addSanPham(Cart cart) {
		String key = cart.getProduct().getCode();
		if (this.containsKey(key)) {
			int oldQuantity = ((Cart)this.get(key)).getQuantity();
			((Cart)this.get(key)).setQuantity(oldQuantity+1);
		}else {
			this.put(cart.getProduct().getCode(), cart);
		}
		
	}
	
	public boolean removeSanPham(String code) {
		if (this.containsKey(code)) {
			this.remove(code);
			return true;
		}
		return false;
	}
	
	public CartDao() {
		// TODO Auto-generated constructor stub
		super();
	}
}
