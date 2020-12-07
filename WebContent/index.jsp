<%@page import="com.vote.dto.Tbl_Vote_202005"%>
<%@page import="java.util.List"%>
<%@page import="com.vote.dao.TBLDao"%>
<%@page import="DBPKG.OracleConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	header li{
		display: inline-block;
		text-decoration: none;
		height: 50px;
		line-height: 50px;
		margin-right: 20px;
	}
	header li a{
		text-decoration: none;
		color:black;
	}
	header li a:HOVER{
		text-decoration: underline;
	}
	header{
		border: 1px solid;
		height: 50px;
		background-color: green;
	}
</style>
</head>
<body>
	<jsp:include page="jsp/header.jsp"></jsp:include>
	<% TBLDao dao = new TBLDao();
		List<Tbl_Vote_202005> list = dao.getAllList();
		System.out.println(list);
	%>
	
	
	<nav></nav>
	<section></section>
	<footer></footer>

</body>
</html>