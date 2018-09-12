<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%= request.getAttribute("msg")%>
//jstl and EL

				${requestScope.msg} //page,req,session,appliaction(serv ctxt)
<br>
<br>

<c:if test="${!empty cList }">
	<c:forEach items="${cList}" var="custData">
		${custData.getName()}<br/>
		${custData.getCity()}<br/>
		${custData.getmobile()}<br/>
		${custData.getEmail()}<br/>
		${custData.getAddress()}<br/>
	</c:forEach>	
</c:if>
<c:if test="${empty cList}">
	No customer details found!!!
</c:if>
</body>
</html>





