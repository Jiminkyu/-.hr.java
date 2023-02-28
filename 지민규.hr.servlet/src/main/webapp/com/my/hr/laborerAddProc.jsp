<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='java.util.List, java.util.ArrayList,java.time.LocalDate, java.time.format.DateTimeFormatter' %>
<%@ page import='com.my.hr.service.LaborerService, com.my.hr.service.LaborerServiceImpl'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<% 
 	LaborerService laborerService = new LaborerServiceImpl();
	String laborerName = request.getParameter("laborerName");
	String hd = request.getParameter("hireDate");
	LocalDate hireDate = LocalDate.parse(hd, DateTimeFormatter.ISO_DATE);
%> 
	
<%= laborerService.addLaborer(laborerName, hireDate) %>
<c:redirect url='laborerList.jsp'/>