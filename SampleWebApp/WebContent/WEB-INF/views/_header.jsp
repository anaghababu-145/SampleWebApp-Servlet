<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<div style="background: #E0E0E0; height: 55px;">
<div style="float: left">
	<h1>My Site</h1>
	</div>
	<div style="float: right; padding: 10px; text-align: right;">
	<!-- user store in session with attribute: loginedUser -->
	Hello <b>${loginedUser.userName}</b> Search<input name="search">
</div>
</div>

