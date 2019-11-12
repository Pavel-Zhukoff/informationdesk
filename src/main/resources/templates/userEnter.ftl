<#import "components/common.ftl" as common/>
<#import "components/forms.ftl" as formComponent/>
<@common.head title="Вход"/>
<@common.header/>
<h1 class="page-title">
    Вход
</h1>
<div class="login-form">
    <@formComponent.form
    title="Форма входа"
    action="/user/enter"
    method="post">
        <@formComponent.inputText
                label="Имя пользователя"
                name="username"
                required=true/>
        <@formComponent.inputText
                label="E-mail"
                type="email"
                name="email"
                required=true/>
        <@formComponent.inputText
                label="Пароль"
                type="password"
                name="password"
                required=true/>
        <@formComponent.submitButton
                value="Войти"/>
    </@formComponent.form>
</div>

<@common.footer/>
