<%--
  Created by IntelliJ IDEA.
  User: 98461
  Date: 2019/4/27
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el4隐式对象</title>
</head>
<body>
    ${pageContext.request}<br>
    <h4>获取动态的虚拟目录</h4>
    ${pageContext.request.contextPath}<br>
</body>
</html>
