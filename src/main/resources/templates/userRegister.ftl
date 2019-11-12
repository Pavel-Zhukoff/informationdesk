<#import "components/common.ftl" as common/>
<#import "components/forms.ftl" as formComponent/>

<@common.head title="Регистрация"/>
<@common.header/>
<h1 class="page-title">
    Регистрация
</h1>
<div class="login-form">
    <@formComponent.form
    title="Форма регистрации"
    action="/user/register"
    method="post"
    path="user">
        <@formComponent.inputText
        label="Имя пользователя"
        name="username"
        value="${user.username}"
        error="${usernameError!}"
        required=true/>
        <@formComponent.inputText
        label="E-mail"
        type="email"
        name="email"
        value="${user.email}"
        error="${emailError!}"
        required=true/>
        <@formComponent.inputText
        label="Пароль"
        type="password"
        name="password"
        required=true/>
        <@formComponent.inputText
        label="Повтор пароля"
        type="password"
        name="passwordRepeat"
        error="${passwordsError!}"
        required=true/>
        <@formComponent.submitButton
        value="Войти"/>
    </@formComponent.form>
</div>

<@common.footer/>
