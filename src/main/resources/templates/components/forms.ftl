<#macro form title="" action="#" method="get">
    <fieldset>
        <legend>${title}</legend>
        <form action="${action}" method="${method}" >
            <#nested>
        </form>
    </fieldset>
</#macro>

<#macro inputText label="" type="text" name="" value="" required=false disabled=false>
    <div class="form-group">
        <label for="${name}">${label}</label>
        <input
                id="${name}"
                type="${type}"
                name="${name}"
                value=""
                ${disabled?string("disabled", "")}
                ${required?string("required", "")}>
    </div>
</#macro>

<#macro inputCheckbox label="" name="" checked=false required=false disabled=false>
    <div class="form-group">
        <label for="${name}">
            ${label}
            <input
                    id="${name}"
                    type="checkbox"
                    name="${name}"
                    ${checked?string("checked", "")}
                    ${disabled?string("disabled", "")}
                    ${required?string("required", "")}>
        </label>
    </div>
</#macro>

<#macro inputSelect label="" name="" options=[]  required=false>
    <div class="form-group">
        <label for="${name}">${label}</label>
        <select
                name="${name}"
                id="${name}"
                ${options???string("disabled", "")}
                ${required?string("required", "")}>
            <#list options as option>
                <option
                        value="${option.value}"
                        ${option.selected?string("selected", "")}>
                    ${option.name}
                </option>
            </#list>
        </select>
    </div>
</#macro>