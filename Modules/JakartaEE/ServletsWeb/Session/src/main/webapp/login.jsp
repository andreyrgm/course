<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login form</title>
</head>
<body>
<h1>Sign in</h1>
<form action="/session/login" method="post">
    <div>
        <label for="username">Username</label>
        <div><input id="username" name="username" type="text"></div>
    </div>
    <div>
        <label for="password">Password</label>
        <div><input id="password" name="password" type="password"></div>
    </div>
    <div><input type="submit" value="Login"></div>
</form>
</body>
</html>
