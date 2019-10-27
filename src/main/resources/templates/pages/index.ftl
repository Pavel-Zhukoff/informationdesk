<#import "components/head.ftl" as head/>
<@head.head title="Главная"/>

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