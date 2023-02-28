<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<form action='laborerAddProc.jsp' method='post'>
	<label>이름: <input type='text' name='laborerName' /></label><br>
	<label>입사일: <input type='date' name='hireDate' /></label><br>
	
	<button type='submit'>추가완료</button>
	<button type='submit' formaction='main.jsp'>메인</button>
</form>
<%
	String msg = request.getParameter("msg");
	if(msg != null) out.println(msg);
%>