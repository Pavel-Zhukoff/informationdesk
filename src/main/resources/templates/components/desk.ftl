<#macro item info>
    <div>
        <h3>${info.title}</h3>
        <p>${info.text}</p>
        <p><small>Дата публикации: ${info.creationDate} | Автор: ${info.authorUser.username}</small></p>
    </div>
</#macro>