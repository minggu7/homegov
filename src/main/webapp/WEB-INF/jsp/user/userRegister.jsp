<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>회원가입</title>
</head>
<body>
    <h2>회원가입</h2>
    <form action="/registerUser.do" method="post">
        <label for="username">유저명:</label>
        <input type="text" id="username" name="username" required><br/><br/>

        <label for="password">비밀번호:</label>
        <input type="password" id="password" name="password" required><br/><br/>

        <button type="submit">가입하기</button>
    </form>
</body>
</html>
