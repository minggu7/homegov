<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>User List</title>
</head>
<body>
    <h2>사용자 목록</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>유저명</th>
                <th>비밀번호</th>
                <th>생성일시</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="user" items="${userList}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>${user.createdAt}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
    <!-- userList.jsp 하단에 추가 -->
<br/>
<form action="/userRegister.do" method="get">
    <button type="submit">회원가입</button>
</form>
</body>
</html>
