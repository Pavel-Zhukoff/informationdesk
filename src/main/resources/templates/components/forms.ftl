<#import "/spring.ftl" as spring />
<#macro form title="" action="#" method="get" path="">
    <fieldset
            class="form">
        <legend
                class="form-title">
            ${title}
        </legend>
        <form
                action="${action}"
                method="${method}">
            <@spring.bind path="${path}" />
            <#nested>
        </form>
    </fieldset>
</#macro>

<#macro inputText label="" name="" type="text" value="" error="" required=false disabled=false>
    <div class="form-group">
        <label
                for="id-${name}"
                class="form-label">
            ${label}
            <#if required>
                <sup class="required-field" title="Обязательно к заполнению">*</sup>
            </#if>
        </label>
        <input
                id="id-${name}"
                class="form-input ${error?has_content?string("form-error", "")}"
                name="${name}"
                type="${type}"
                value="${value}"
                ${disabled?string("disabled", "")}
                ${required?string("required", "")}/>
        <#if error?has_content>
            <p class="form-error-message">
                ${error}
            </p>
        </#if>
    </div>
</#macro>

<#macro inputCheckbox label="" name="" error="" checked=false required=false disabled=false>
    <div class="form-group">
        <label
                for="id-${name}"
                class="form-label checkbox-label">
            ${label}
            <#if required>
                <sup class="required-field" title="Обязательно к заполнению">*</sup>
            </#if>
            <input
                    id="id-${name}"
                    class="form-checkbox"
                    type="checkbox"
                    name="${name}"
                    ${checked?string("checked", "")}
                    ${disabled?string("disabled", "")}
                    ${required?string("required", "")}>
        </label>
        <#if error?has_content>
            <p class="form-error-message">
                ${error}
            </p>
        </#if>
    </div>
</#macro>

<#macro inputSelect label="" name="" error="" options=[]  required=false>
    <div class="form-group">
        <label
                for="id-${name}"
                class="form-label">
            ${label}
            <#if required>
                <sup class="required-field" title="Обязательно к заполнению">*</sup>
            </#if>
        </label>
        <select
                id="id-${name}"
                class="form-select ${error?has_content?string("form-error", "")}"
                name="${name}"
                ${options???string("disabled", "")}
                ${required?string("required", "")}>
            <#list options as option>
                <option
                        class="form-select_option"
                        value="${option.value}"
                        ${option.selected?string("selected", "")}>
                    ${option.name}
                </option>
            </#list>
        </select>
        <#if error?has_content>
            <p class="form-error-message">
                ${error}
            </p>
        </#if>
    </div>
</#macro>

<#macro submitButton type="submit" value="Отправить" disabled=false>
    <div class="form-group">
        <input
                class="button-default"
                type="${type}"
                value="${value}"
                ${disabled?string("disabled", "")}
    </div>
</#macro>