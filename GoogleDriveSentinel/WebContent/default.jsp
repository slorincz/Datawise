<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@page import="com.datawise.utils.ConnectionFactory"%>
<%@page import="java.sql.Connection"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Connection con = ConnectionFactory.openConnection();
if(con!=null && !con.isClosed()){
%>
	DB Connection is open.
<%
} else {
%>
	DB Connection is close.
<%	
}
ConnectionFactory.closeConnection();
%>
</body>
</html>