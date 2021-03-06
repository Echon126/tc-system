package com.tianta.tc.db.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author ZKTT
 */
public class TcMonitorLog implements Serializable {
    private static final long serialVersionUID = -5728638552390084298L;

    private Integer id;
    private String sid;
    private String mid;
    private String satName;
    private String stationName;
    private Integer commandId;
    private String commandCode;
    private String commandName;
    private String commandData;
    private Date sendTime;
    private Date executeTime;
    private String processDesc;
    private String sendOperator;
    private Date createTime;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getSatName() {
        return satName;
    }

    public void setSatName(String satName) {
        this.satName = satName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getCommandId() {
        return commandId;
    }

    public void setCommandId(Integer commandId) {
        this.commandId = commandId;
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

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Date executeTime) {
        this.executeTime = executeTime;
    }

    public String getProcessDesc() {
        return processDesc;
    }

    public void setProcessDesc(String processDesc) {
        this.processDesc = processDesc;
    }

    public String getSendOperator() {
        return sendOperator;
    }

    public void setSendOperator(String sendOperator) {
        this.sendOperator = sendOperator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        TcMonitorLog that = (TcMonitorLog) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(sid, that.sid) &&
                Objects.equals(mid, that.mid) &&
                Objects.equals(satName, that.satName) &&
                Objects.equals(stationName, that.stationName) &&
                Objects.equals(commandId, that.commandId) &&
                Objects.equals(commandCode, that.commandCode) &&
                Objects.equals(commandName, that.commandName) &&
                Objects.equals(commandData, that.commandData) &&
                Objects.equals(sendTime, that.sendTime) &&
                Objects.equals(executeTime, that.executeTime) &&
                Objects.equals(processDesc, that.processDesc) &&
                Objects.equals(sendOperator, that.sendOperator) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sid, mid, satName, stationName, commandId, commandCode, commandName, commandData, sendTime, executeTime, processDesc, sendOperator, createTime, status);
    }
}
