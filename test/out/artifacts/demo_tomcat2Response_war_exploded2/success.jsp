<%--
  Created by IntelliJ IDEA.
  User: 98461
  Date: 2019/4/26
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><%=request.getSession().getAttribute("user")%>欢迎您！</h1>
</body>
</html>
