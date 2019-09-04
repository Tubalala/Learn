<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 98461
  Date: 2019/4/29
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl3</title>
</head>
<body>
    <%
        ArrayList<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");
        request.setAttribute("list",list);
    %>
    <%--begin:起始 end:结束 var:变量 step:步长 varStatus:循环状态对象--%>
    <c:forEach begin="1" end="10" var="i" step="1" varStatus="s">
        ${i} <h1>${s.index}</h1> <h1> ${s.count}</h1><br>
        <%--index:容器索引  count:循环次数--%>
    </c:forEach>

<hr>
    <c:forEach items="${list}" var="str" varStatus="s" >
        ${str} ${s.index} ${s.count}<br>
    </c:forEach>
</body>
</html>
