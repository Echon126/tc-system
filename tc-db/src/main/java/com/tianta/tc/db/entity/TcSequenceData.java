package com.tianta.tc.db.entity;

import java.io.Serializable;

/**
 * @author ZKTT
 */
public class TcSequenceData implements Serializable {
    private static final long serialVersionUID = -7013818510483184207L;

    private Integer id;
    private Integer seqId;
    private String seqItemName;
    private String seqItemCode;
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
}
