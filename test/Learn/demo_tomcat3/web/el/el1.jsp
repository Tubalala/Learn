<%--
  Created by IntelliJ IDEA.
  User: 98461
  Date: 2019/4/27
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el1</title>
</head>
<body>
    ${ 3 > 4};
    \${ 3 > 4}
<hr>
    <h1>算数运算符</h1>
        ${3+4};<br>
        ${4-3};<br>
        ${3/4};<br>
        ${3 div 4};<br>
        ${3 % 4};<br>
        ${3 mod 4};<br>
    <h1>比较运算符</h1>
        ${ 3 < 4 };<br>
        ${ 3 < 4 && 3 > 4};<br>
</body>
</html>
