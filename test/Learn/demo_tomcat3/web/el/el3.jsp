<%@ page import="com.tu.domin.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: 98461
  Date: 2019/4/27
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el3</title>
</head>
<body>
    <%
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setBirthday(new Date());
        request.setAttribute("u",user);
    %>
    ${requestScope.u}
    ${requestScope.u.name}
    ${requestScope.u.age}<br>
    ${requestScope.u.birthday}<br>
    ${requestScope.u.birthday.month}<br>
    ${requestScope.u.birStr}

<hr>
<%
    List list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add(user);
    request.setAttribute("list",list);
%>
${list}<br>
${list[0]}<br>
${list[1]}<br>
${list[2].name}<br>

<hr>
<%
    Map map = new HashMap<>();
    map.put("name","张三");
    map.put("gender","男");
    map.put("user",user);
    request.setAttribute("map",map);
%>
${map.gender}<br>
${map["name"]}<br>
${map["user"].age}<br>

<hr>
<h1>empty运算符</h1>
<%
    String str = "";
    request.setAttribute("str",str);
%>
${empty str}<br>
${empty u}<br>
${empty list}<br>
${empty map}<br>
</body>
</html>
