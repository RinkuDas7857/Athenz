//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import com.yahoo.rdl.*;

//
// Groups - The representation for a list of groups with full details
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class Groups {
    public List<Group> list;

    public Groups setList(List<Group> list) {
        this.list = list;
        return this;
    }
    public List<Group> getList() {
        return list;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Groups.class) {
                return false;
            }
            Groups a = (Groups) another;
            if (list == null ? a.list != null : !list.equals(a.list)) {
                return false;
            }
        }
        return true;
    }
}