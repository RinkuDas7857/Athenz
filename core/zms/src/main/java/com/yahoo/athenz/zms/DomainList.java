//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import com.yahoo.rdl.*;

//
// DomainList - A paginated list of domains.
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class DomainList {
    public List<String> names;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String next;

    public DomainList setNames(List<String> names) {
        this.names = names;
        return this;
    }
    public List<String> getNames() {
        return names;
    }
    public DomainList setNext(String next) {
        this.next = next;
        return this;
    }
    public String getNext() {
        return next;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != DomainList.class) {
                return false;
            }
            DomainList a = (DomainList) another;
            if (names == null ? a.names != null : !names.equals(a.names)) {
                return false;
            }
            if (next == null ? a.next != null : !next.equals(a.next)) {
                return false;
            }
        }
        return true;
    }
}