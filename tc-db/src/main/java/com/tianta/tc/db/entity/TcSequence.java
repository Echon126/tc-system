package com.tianta.tc.db.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author ZKTT
 */
public class TcSequence implements Serializable {
    private static final long serialVersionUID = -6981001045052151268L;

    private Integer id;
    private String mid;
    private String sequenceName;
    private String sequenceCode;
    private Integer sequenceOrder;
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

    public String getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }

    public String getSequenceCode() {
        return sequenceCode;
    }

    public void setSequenceCode(String sequenceCode) {
        this.sequenceCode = sequenceCode;
    }

    public Integer getSequenceOrder() {
        return sequenceOrder;
    }

    public void setSequenceOrder(Integer sequenceOrder) {
        this.sequenceOrder = sequenceOrder;
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
        TcSequence that = (TcSequence) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(mid, that.mid) &&
                Objects.equals(sequenceName, that.sequenceName) &&
                Objects.equals(sequenceCode, that.sequenceCode) &&
                Objects.equals(sequenceOrder, that.sequenceOrder) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mid, sequenceName, sequenceCode, sequenceOrder, createTime, creator, status);
    }
}
