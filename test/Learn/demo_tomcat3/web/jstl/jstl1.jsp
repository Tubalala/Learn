<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 98461
  Date: 2019/4/29
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl1</title>
</head>
<body>
<c:if test="false">假</c:if>
<c:if test="true">真</c:if>
<br>
<%
    List<String> list = new ArrayList<>();
    list.add("aaaa");
    request.setAttribute("list",list);
    int number = 4;
    request.setAttribute("number",number);
%>
<br>
<c:if test="${not empty list}">
    遍历数组。。。。
</c:if>
<c:if test="${number%2==0}">
    为偶
</c:if>
<%

%>
<c:if test="${number%2!=0}">
    为基
</c:if>


</body>
</html>
