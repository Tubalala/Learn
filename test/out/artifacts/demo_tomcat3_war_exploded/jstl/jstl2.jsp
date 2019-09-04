<%--
  Created by IntelliJ IDEA.
  User: 98461
  Date: 2019/4/29
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl2</title>
</head>
<body>
    <%
        request.setAttribute("number",51);
    %>
    <c:choose>
        <c:when test="${number==1}">星期一</c:when>
        <c:when test="${number==2}">星期二</c:when>
        <c:when test="${number==3}">星期三</c:when>
        <c:when test="${number==4}">星期四</c:when>
        <c:when test="${number==5}">星期五</c:when>
        <c:when test="${number==6}">星期六</c:when>
        <c:when test="${number==7}">星期日</c:when>
        <c:otherwise>输入有误</c:otherwise>
    </c:choose>
</body>
</html>
