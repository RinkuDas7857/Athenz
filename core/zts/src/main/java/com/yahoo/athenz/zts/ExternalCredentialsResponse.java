//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zts;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;
import com.yahoo.rdl.*;

//
// ExternalCredentialsResponse -
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalCredentialsResponse {
    public Map<String, String> attributes;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Timestamp expiration;

    public ExternalCredentialsResponse setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public Map<String, String> getAttributes() {
        return attributes;
    }
    public ExternalCredentialsResponse setExpiration(Timestamp expiration) {
        this.expiration = expiration;
        return this;
    }
    public Timestamp getExpiration() {
        return expiration;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != ExternalCredentialsResponse.class) {
                return false;
            }
            ExternalCredentialsResponse a = (ExternalCredentialsResponse) another;
            if (attributes == null ? a.attributes != null : !attributes.equals(a.attributes)) {
                return false;
            }
            if (expiration == null ? a.expiration != null : !expiration.equals(a.expiration)) {
                return false;
            }
        }
        return true;
    }
}
