<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
td
{
 color:red;
}
input
{
 border:1px solid gray;
}
</style>
<body>
   <jsp:include page="_header.jsp"></jsp:include>
   <jsp:include page="_menu.jsp"></jsp:include>
   <h3>Product Page</h3>
   <p style="color: red;">${errorString}</p>
<form method="POST" action="${pageContext.request.contextPath}/product">
     <table border="0" cellspacing="10px">
          <tr>
             <td>Product Id</td>
 <td><input type="text" name="proid" value= "${pro.proid}" /> </td>
           </tr>
           <tr>
              <td>Product Name</td>
<td><input type="text" name="proname" value= "${pro.proname}" /> </td>
           </tr>
           <tr>
              <td>Product Quantity</td>
<td><input type="text" name="proqty" value= "${pro.proqty}" /> </td>
           </tr>
           <td>Product Price</td>
<td><input type="text" name="proprice" value= "${pro.proprice}" /> </td>
           </tr>
           <tr>
              <td>Remember me</td>
              <td><input type="checkbox" name="rememberMe" value= "Y" /> </td>
           </tr>
           <tr>
              <td colspan ="2">
                 <input type="submit" value="Submit" />
                 <a href="${pageContext.request.contextPath}/">Cancel</a>
              </td>
           </tr>
        </table>
     </form>
</body>

</html>