<%--
  Created by IntelliJ IDEA.
  User: test
  Date: 2015-09-19
  Time: 오후 3:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <title></title>
</head>
<body>
<fmt:setTimeZone value="GMT+9"/>
<fieldset>
  <legend>온습도 값: <fmt:formatDate value="${dackjang.updatetime}" pattern="yyyy-MM-dd HH:mm" /></legend>
  <p>온도: ${dackjang.temper}</p>
  <p>습도: ${dackjang.humidity}</p>
</fieldset>
</body>
</html>
