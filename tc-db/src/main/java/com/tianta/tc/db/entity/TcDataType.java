package com.tianta.tc.db.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author ZKTT
 */
public class TcDataType  implements Serializable {
    private static final long serialVersionUID = -7326745567366323437L;

    private Integer id;
    private Integer pid;
    private String mid;
    private String typeCode;
    private String typeName;
    private String typeDesc;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TcDataType that = (TcDataType) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(pid, that.pid) &&
                Objects.equals(mid, that.mid) &&
                Objects.equals(typeCode, that.typeCode) &&
                Objects.equals(typeName, that.typeName) &&
                Objects.equals(typeDesc, that.typeDesc) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pid, mid, typeCode, typeName, typeDesc, status);
    }
}
