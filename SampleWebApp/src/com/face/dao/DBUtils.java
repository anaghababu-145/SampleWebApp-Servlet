package com.face.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.face.bo.ProductAccount;
import com.face.bo.UserAccount;



public class DBUtils {
	public static UserAccount findUser(Connection conn, //
	           String userName, String password) throws SQLException {
	       String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a " //
	               + " where a.User_Name = ? and a.password= ?";
	       PreparedStatement pstm = conn.prepareStatement(sql);
	       pstm.setString(1, userName);
	       pstm.setString(2, password);
	       ResultSet rs = pstm.executeQuery();
	       if (rs.next()) {
	           String gender = rs.getString("Gender");
	           UserAccount user = new UserAccount();
	           user.setUserName(userName);
	           user.setPassword(password);
	           user.setGender(gender);
	           return user;
	       }
	       return null;
	   }

//	public static ProductAccount findProduct(Connection conn, String productId, String productName, String productQuantity,
//			String productPrice) throws SQLException 
//	{
//		
//		       String sql = "insert into product(product_Name,product_Quantity,product_Price)values('"++"')";
//		       PreparedStatement pstm = conn.prepareStatement(sql);
//		       pstm.setString(1, productId);
//		       pstm.setString(2, productName);
//		       pstm.setString(3, productQuantity);
//		       pstm.setString(4, productPrice);
//
//		       ResultSet rs = pstm.executeQuery();
//		       if (rs.next()) {
//		           ProductAccount pro=new ProductAccount();
//		           pro.setProductId(productId);
//		           pro.setProductName(productName);
//		           pro.setProductQuantity(productQuantity);
//		           pro.setProdcutPrice(productPrice);
//		       }
//		return null;
//	}
}
