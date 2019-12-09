//program starts here
//creating a package as com.face.bo

package com.face.bo;

//create a class ProductAccount

public class ProductAccount 
{
        //declaring variables as private
	
        private String productId;
        private String productName;
        private String productQuantity;
        private String prodcutPrice;
	
        //setting getters and setters for the variables
	
	public String getProductId() 
	{
		return productId;
	}
	public void setProductId(String productId) 
	{
		this.productId = productId;
	}
	public String getProductName() 
	{
		return productName;
	}
	public void setProductName(String productName) 
	{
		this.productName = productName;
	}
	public String getProductQuantity() 
	{
		return productQuantity;
	}
	public void setProductQuantity(String productQuantity) 
	{
		this.productQuantity = productQuantity;
	}
	public String getProdcutPrice() 
	{
		return prodcutPrice;
	}
	public void setProdcutPrice(String prodcutPrice) 
	{
		this.prodcutPrice = prodcutPrice;
        }

}
//program ends here
