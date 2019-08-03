package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BEAN.Product;


public class ProductDAO {

	public static List<Product> Show (Connection conn) {
		List<Product> list = new ArrayList<Product>();
		String sql = " select * from PRODUCTS";
		PreparedStatement pstm = null;
		try {
			pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setCode(rs.getString("Code"));
				product.setName(rs.getString("Name"));
				product.setPrice(rs.getFloat("price"));
				list.add(product);
			}
			pstm.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void deleteProduct(Connection conn,Product product) {
		String sql = "delete from PRODUCTS whhere Code = ?";
		PreparedStatement pstm = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, product.getCode());
			pstm.executeUpdate();
			pstm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public static void insertProduct(Connection conn, Product product)  {
			String sql = "insert into PRODUCTS values(?,?,?)";
			PreparedStatement pstm = null;
			try {
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, product.getCode()); 
				pstm.setString(2, product.getName());
				pstm.setFloat(3, product.getPrice());
				pstm.executeUpdate();
				pstm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
	public void updateProduct(Connection conn, Product product)  {
		String sql = "update PRODUCTS set Name = ?, Price = ? where Code = ?";
		PreparedStatement pstm = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, product.getCode());
			pstm.setString(2, product.getName());
			pstm.setFloat(3, product.getPrice());
			pstm.executeUpdate();
			pstm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Product getProductByID(Connection conn, int id) {
		Product product = new Product();
		String sql = "select * from PRODUCTS whhere Code = ?";
		PreparedStatement pstm = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				product.setCode(rs.getString("Code"));
				product.setName(rs.getString("Name"));
				product.setPrice(rs.getFloat("Price"));
			}
			pstm.close();
			return product;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
		
	}
}
