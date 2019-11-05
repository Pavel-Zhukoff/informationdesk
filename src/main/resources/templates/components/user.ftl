<#macro topAuthorsList author>
    <div>
        <h3>
            <a href="/user/${author.id}">${author.username}</a>&nbsp;|
            <small>
                Количество публикаций: ${author.pubCount}
            </small>
        </h3>
    </div>
</#macro>