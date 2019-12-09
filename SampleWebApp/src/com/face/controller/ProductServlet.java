package com.face.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.ProductAccount;
import com.face.bo.UserAccount;
import com.face.dao.DBUtils;
import com.face.dao.MyUtils;
import com.face.dao.PDUtils;
import com.face.utility.MySQLConnUtils;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet(urlPatterns= {"/product"})
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Welcome to Product Servlet");
	       // Forward to /WEB-INF/views/loginView.jsp
	       // (Users can not access directly into JSP pages placed in WEB-INF)
	       RequestDispatcher dispatcher //
	               = this.getServletContext().getRequestDispatcher("/WEB-INF/views/productView.jsp");
	       dispatcher.forward(request, response);
	}
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String productId = request.getParameter("proid");
		String productName = request.getParameter("proname");
	       String  productQuantity = request.getParameter("proqty");
	       String productPrice = request.getParameter("proprice");
	       String rememberMeStr = request.getParameter("rememberMe");
	       
	    	   ProductAccount pro =  new ProductAccount();
	         pro.setProductId(productId);
	         pro.setProductName(productName);
	         pro.setProductQuantity(productQuantity);
	         pro.setProdcutPrice(productPrice);
	         
	         ArrayList<String> list = new ArrayList<String>();
	         //Connection conn=MyUtils.getStoredConnection(request);
	         MySQLConnUtils conn=new MySQLConnUtils();
	         try {
				try {
					PDUtils.insert(MySQLConnUtils.getConnection(),pro);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
				try {
					list=PDUtils.display(conn);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  for(int i=0;i<list.size();i++)
			  {
				  System.out.println(list.get(i));
				  
			  }
	           request.setAttribute("datalist", list);
	           RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/productShow.jsp");
	           dispatcher.forward(request, response);
	       }
	       
	}


