<#import "components/common.ftl" as common/>
<#import "components/desk.ftl" as deskComponent/>
<@common.head title="Главная"/>
<@common.header/>

<#list desks as desk>
    <@deskComponent.item info=desk />
</#list>

<@common.footer />