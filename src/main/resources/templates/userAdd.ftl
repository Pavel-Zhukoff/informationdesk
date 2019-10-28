<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h1>Create user</h1>
    <form action="/user/add" name="user" method="post">
        <input title="Username" type="text" name="username">
        <input title="password" type="text" name="password">
        <input title="Email" type="text" name="email">
        <input type="submit">
    </form>
</body>
</html>