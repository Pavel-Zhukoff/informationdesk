<#import "components/common.ftl" as common/>
<#import "components/desk.ftl" as deskComponent/>
<#import "components/user.ftl" as userComponent/>
<#import "components/forms.ftl" as formComponent/>
<@common.head title="Главная"/>
<@common.header/>
    <h1 class="page-title">
        Главная
    </h1>
    <div class="content">
        <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Excepturi facilis impedit iste mollitia quos repudiandae, sed soluta totam unde voluptates? Amet dignissimos fuga minima nihil numquam quas repudiandae sapiente vero!
        </p>
        <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias, consequatur esse est facilis, iusto minus nobis odio pariatur porro possimus quam quibusdam quidem repellat rerum, soluta suscipit tempore ullam veniam!
        </p>

        <div class="section desk-list">
            <h2 class="section-title">Последние записи</h2>
            <div class="section-content">
                <#list desks as desk>
                    <@deskComponent.item info=desk />
                </#list>
            </div>
        </div>

        <div class="section top-author-list">
            <h2 class="section-title">Топ авторов месяца</h2>
            <div class="section-content">
                <#list users>
                    <#items as user>
                        <#if user.pubCount gt 0 >
                            <@userComponent.topAuthorsList author=user />
                        </#if>
                    </#items>
                    <#else>
                    <p>
                        Пусто!
                    </p>
                </#list>
            </div>
        </div>
    </div>

<@common.footer />