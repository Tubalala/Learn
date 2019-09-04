<%--
  Created by IntelliJ IDEA.
  User: 98461
  Date: 2019/4/27
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el2</title>
</head>
<body>
    <%
        request.setAttribute("name","张三");
        session.setAttribute("age","23");
    %>
    ${requestScope.name}
    ${sessionScope.age}
</body>
</html>
