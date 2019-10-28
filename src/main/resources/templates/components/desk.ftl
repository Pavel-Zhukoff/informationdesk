<#macro item info>
    <div>
        <h3>${info.getTitle()}</h3>
        <p>${info.getText()}</p>
        <p><small>Дата публикации: ${info.getCreationDate()} | Автор: ${info.getAuthorUser().getUsername()}</small></p>
    </div>
</#macro>