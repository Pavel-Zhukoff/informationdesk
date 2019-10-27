<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>

    <link rel="stylesheet" href="/style/style.css">
</head>

<h1>Hello, world!</h1>

<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Username</th>
        <th>Email</th>
        <th>Register Date</th>
    </tr>
    </thead>
    <tbody>
    <#list users as user>
        <tr>
            <td><a href="/user/${user.userId}">${user.userId}</a></td>
            <td>${user.username}</td>
            <td>${user.email}</td>
            <td>${user.date}</td>
        </tr>
    </#list>
    </tbody>
</table>
</body>
</html>