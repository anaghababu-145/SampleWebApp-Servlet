package com.face.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.face.bo.ProductAccount;
import com.face.utility.MySQLConnUtils;

public class PDUtils {

	public static void insert(Connection conn, ProductAccount pro) throws SQLException {
		// TODO Auto-generated method stub
		Statement st=conn.createStatement();
		String id=pro.getProductId();
		String name=pro.getProductName();
		String qty=pro.getProductQuantity();
		String price=pro.getProdcutPrice();
		String query="insert into product(product_Id,product_Name,product_Quantity,product_Price) values('"+id+"','"+name+"','"+qty+"','"+price+"')";
		int result=st.executeUpdate(query);
		if(result==1)
		{
			System.out.println("Data inserted successfully");
		}
		else
		{
			System.out.println("Please check");
		}
		

	}



	


	public static ArrayList<String> display(MySQLConnUtils conn) throws SQLException {
		// TODO Auto-generated method stub
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from product");
		
		// while(rs.next()) {
//		    System.out.println(rs.getString("productName1")+"\t"+rs.getString("productId1")+"\t"+rs.getString("productquantity1")+"\t"+rs.getString("productprice1"));
//		     System.out.println();
//		     System.out.println("printing the values from the table........");
//		    }
		ArrayList<String> customer = new ArrayList<String>();
		while (rs.next()) {
		System.out.println("adding to the arraylst");
		             
		           customer.add(rs.getString("product_Id"));
		           customer.add(rs.getString("product_Name"));
		           customer.add(rs.getString("product_Quantity"));
		           customer.add(rs.getString("product_Price"));
		       }
		return customer;
	}
}
