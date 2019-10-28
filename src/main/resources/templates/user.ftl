<#import "components/common.ftl" as common/>
<@common.head title="Пользователь ${user.getUsername()}"/>

<h1>User ${user.username}</h1>
<h2>ID: ${user.userId}</h2>
<h2>Email: ${user.email}</h2>
<h2>Register date: ${user.date}</h2>

<@common.footer/>
