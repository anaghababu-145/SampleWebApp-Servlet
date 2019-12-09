<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
  <%@page import="java.util.Iterator"%>
  <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <jsp:include page="_header.jsp"></jsp:include>
   <jsp:include page="_menu.jsp"></jsp:include>
    <h3>Hello: ${user.userName}</h3>
    Product Name: <b>${user.userName}</b>
    <jsp:include page="_footer.jsp"></jsp:include> --%>
    <jsp:include page="_header.jsp"></jsp:include>
   <jsp:include page="_menu.jsp"></jsp:include>
    <h1>  product details</h1>
   <table>
   <%Iterator itr;%>
           <% List data= (List)request.getAttribute("datalist");
               for (itr=data.iterator(); itr.hasNext(); )
               {
           %>
          <tr>
             <td><%=itr.next()%></td>
              <td><%=itr.next()%></td>
                <td><%=itr.next()%></td>
                  <td><%=itr.next()%></td>
             </tr>
             <%
             }
             %>
       </table>
                <a href="${pageContext.request.contextPath}/productinfo"><input type="button" value="edit"></a>
 <a href="${pageContext.request.contextPath}/delete">deleteitem</a><br>
 <a href="${pageContext.request.contextPath}/product">ADDitem</a>
    <jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>