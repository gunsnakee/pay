<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/11/15
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>demo page</title>
</head>
<body>
<%@include file="head.jsp"%>
======================= 蛋碎的分割线 ============================
<br/>
<table  border="1">
    <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>update_time</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${demolist}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td><fmt:formatDate value="${item.updateTime}" pattern="yyyy-MM-dd hh:mm:ss"/>  </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br/>
======================= 蛋碎的分割线 ============================
<%@include file="footer.jsp"%>
</body>
</html>
