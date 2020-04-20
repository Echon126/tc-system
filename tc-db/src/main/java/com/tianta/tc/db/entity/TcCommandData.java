package com.tianta.tc.db.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 单指令数据体
 *
 * @author ZKTT
 */
public class TcCommandData implements Serializable {
    private static final long serialVersionUID = 4575582239702197535L;

    private Integer id;
    private String mid;
    private String commandCode;
    private String commandName;
    private String commandData;
    private String dynamicParam;
    private String typeCode;
    private Date createTime;
    private String creator;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getCommandCode() {
        return commandCode;
    }

    public void setCommandCode(String commandCode) {
        this.commandCode = commandCode;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandData() {
        return commandData;
    }

    public void setCommandData(String commandData) {
        this.commandData = commandData;
    }

    public String getDynamicParam() {
        return dynamicParam;
    }

    public void setDynamicParam(String dynamicParam) {
        this.dynamicParam = dynamicParam;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
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
        TcCommandData that = (TcCommandData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(mid, that.mid) &&
                Objects.equals(commandCode, that.commandCode) &&
                Objects.equals(commandName, that.commandName) &&
                Objects.equals(commandData, that.commandData) &&
                Objects.equals(dynamicParam, that.dynamicParam) &&
                Objects.equals(typeCode, that.typeCode) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mid, commandCode, commandName, commandData, dynamicParam, typeCode, createTime, creator, status);
    }
}
