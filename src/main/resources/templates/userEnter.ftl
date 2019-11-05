<#import "components/common.ftl" as common/>
<#import "components/forms.ftl" as formComponent/>
<@common.head title="Вход"/>
<h1 class="page-title">
    Вход
</h1>
<div class="login-form">
    <@formComponent.form title="Форма входа" action="/user/add" method="post">

    </@formComponent.form>
</div>

<@common.footer/>
