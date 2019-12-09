//creating a business object class

package com.face.bo;

//create a class UserAccount

public class UserAccount 
{
    //creating two static final variables
    public static final String GENDER_MALE ="M";
    public static final String GENDER_FEMALE = "F";
     
    //creating variables
    private String userName;
    private String gender;
    private String password;
	
    //setting getters and setters for variables	
    public String getUserName() 
    {
	return userName;
    }
    public void setUserName(String userName) 
    {
	this.userName = userName;
    }
    public String getGender() 
    {
	return gender;
    }
    public void setGender(String gender) 
    {
	this.gender = gender;
    }
    public String getPassword() 
    {
	return password;
    }
    public void setPassword(String password) 
    {
	this.password = password;
    }
	
}
