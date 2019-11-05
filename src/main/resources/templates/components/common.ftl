<#macro head title="">
    <!doctype html>
    <html lang="en" xmlns="http://www.w3.org/1999/html">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>${title}</title>

        <link rel="stylesheet" href="/style/style.css">
    </head>
    <body>
    <div class="wrapper">

</#macro>

<#macro header authed=false user="">
    <header>

        <div class="left">
            <nav class="menu">
                <a href="#" class="menu-item">Пункт меню</a>
            </nav>
        </div>

        <div class="right">
            <#if authed>

                <#else>
                <div class="menu">
                    <a href="/user/enter" class="menu-item">Вход</a>
                    <span>|</span>
                    <a href="/user/register" class="menu-item">Регистрация</a>
                </div>
            </#if>
        </div>

    </header>
</#macro>

<#macro footer>
    </div>
    </body>
    </html>
</#macro>