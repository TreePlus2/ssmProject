<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/21
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>测试查询所有学生信息成功</h3>

<c:forEach items="${allStu}" var="stu">
    ${stu.toString()}
    <br>
</c:forEach>

</body>
</html>
