<#import "components/common.ftl" as common/>
<#import "components/forms.ftl" as formComponent/>
<@common.head title="Регистрация"/>
<h1 class="page-title">
    Регистрация
</h1>
<div class="login-form">
    <@formComponent.form title="Форма регистрации" action="/user/add" method="post">

    </@formComponent.form>
</div>

<@common.footer/>
