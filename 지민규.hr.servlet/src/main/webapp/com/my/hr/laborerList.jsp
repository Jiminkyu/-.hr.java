<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ page import='java.util.List, java.util.ArrayList' %>
<%@ page import='com.my.hr.service.LaborerService, com.my.hr.service.LaborerServiceImpl,
				 com.my.hr.dao.LaborerDao, com.my.hr.dao.LaborerDaoImpl'%>
<% 
 	LaborerDao laborerDao = new LaborerDaoImpl();
LaborerService laborerService = new LaborerServiceImpl(laborerDao);

%> 

<!-- <h3>노동자 목록</h3> -->

 
<!-- 			<form action='laborerDelProc.jsp' method='post'> -->
<!-- 				<ul> -->
<%-- 					<c:forEach var='laborer' items='${paramValues.laborer}' varStatus='status'> --%>
<%-- 							<input type='checkbox' name='laborerId' value='${status.count}'/>${status.count} --%>
<%-- 							   |  ${laborer}    | ${param.hireDate}	 --%>
<%-- 					</c:forEach> --%>
<!-- 				</ul> -->
<!-- 				<button type='submit'>삭제</button> -->
<!-- 				<button type='submit' formaction='laborerFixProc.jsp'>수정</button> -->
<!-- 				<button type='submit' formaction='laborerAddProc.jsp'>추가</button>  -->
<!-- 			</form> -->

<!-- <form action='laborerDelProc.jsp' method='post'> -->
<!-- 				<ul> -->
<%-- 					<c:forEach var='laborer' items='${paramValues.laborer}' varStatus='status'> --%>
<%-- 							<input type='checkbox' name='laborer' value='${status.count}'/>${status.count} --%>
<%-- 							   |  ${laborer},    | ${param.hireDate}	 --%>
<%-- 					</c:forEach> --%>
<!-- 				</ul> -->
<!-- 				<button type='submit'>삭제</button> -->
<!-- 				<button type='submit' formaction='laborerFixProc.jsp'>수정</button> -->
<!-- 				<button type='submit' formaction='laborerAddProc.jsp'>추가</button> -->
<!-- 			</form> -->

