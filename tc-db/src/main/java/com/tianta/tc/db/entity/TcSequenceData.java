package com.tianta.tc.db.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author ZKTT
 */
public class TcSequenceData implements Serializable {
    private static final long serialVersionUID = -7013818510483184207L;

    private Integer id;
    private Integer seqId;
    private String seqItemName;
    private String seqItemCode;
    private String seqItemData;
    private Integer seqItemType;
    private Integer intervalTime;
    private Integer isCompare;
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public String getSeqItemName() {
        return seqItemName;
    }

    public void setSeqItemName(String seqItemName) {
        this.seqItemName = seqItemName;
    }

    public String getSeqItemCode() {
        return seqItemCode;
    }

    public void setSeqItemCode(String seqItemCode) {
        this.seqItemCode = seqItemCode;
    }

    public String getSeqItemData() {
        return seqItemData;
    }

    public void setSeqItemData(String seqItemData) {
        this.seqItemData = seqItemData;
    }

    public Integer getSeqItemType() {
        return seqItemType;
    }

    public void setSeqItemType(Integer seqItemType) {
        this.seqItemType = seqItemType;
    }

    public Integer getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    public Integer getIsCompare() {
        return isCompare;
    }

    public void setIsCompare(Integer isCompare) {
        this.isCompare = isCompare;
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
        TcSequenceData that = (TcSequenceData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(seqId, that.seqId) &&
                Objects.equals(seqItemName, that.seqItemName) &&
                Objects.equals(seqItemCode, that.seqItemCode) &&
                Objects.equals(seqItemData, that.seqItemData) &&
                Objects.equals(seqItemType, that.seqItemType) &&
                Objects.equals(intervalTime, that.intervalTime) &&
                Objects.equals(isCompare, that.isCompare) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seqId, seqItemName, seqItemCode, seqItemData, seqItemType, intervalTime, isCompare, status);
    }
}
