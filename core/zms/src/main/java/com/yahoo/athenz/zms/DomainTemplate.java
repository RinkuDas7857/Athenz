//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import com.yahoo.rdl.*;

//
// DomainTemplate - solution template(s) to be applied to a domain
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class DomainTemplate {
    public List<String> templateNames;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<TemplateParam> params;

    public DomainTemplate setTemplateNames(List<String> templateNames) {
        this.templateNames = templateNames;
        return this;
    }
    public List<String> getTemplateNames() {
        return templateNames;
    }
    public DomainTemplate setParams(List<TemplateParam> params) {
        this.params = params;
        return this;
    }
    public List<TemplateParam> getParams() {
        return params;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != DomainTemplate.class) {
                return false;
            }
            DomainTemplate a = (DomainTemplate) another;
            if (templateNames == null ? a.templateNames != null : !templateNames.equals(a.templateNames)) {
                return false;
            }
            if (params == null ? a.params != null : !params.equals(a.params)) {
                return false;
            }
        }
        return true;
    }
}