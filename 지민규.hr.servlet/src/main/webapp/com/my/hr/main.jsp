<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<form action='laborerList.jsp' method='post'>
	<button type='submit'>목록</button>
	<button type='submit' formaction='laborerAddProc.jsp'>추가</button>
</form>
<%
	String msg = request.getParameter("msg");
	if(msg != null) out.println(msg);
%>