package com.tianta.tc.db.entity;

import java.io.Serializable;

/**
 * @author ZKTT
 */
public class TcRuleCondition implements Serializable {
    private static final long serialVersionUID = 7219287561062398525L;

    private Integer id;
    private Integer ruleId;
    private String conditionName;
    private String conditionFlag;
    private String conditionCode;
    private String conditionMethod;
    private Double conditionValue;
    private Integer maxValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public String getConditionFlag() {
        return conditionFlag;
    }

    public void setConditionFlag(String conditionFlag) {
        this.conditionFlag = conditionFlag;
    }

    public String getConditionCode() {
        return conditionCode;
    }

    public void setConditionCode(String conditionCode) {
        this.conditionCode = conditionCode;
    }

    public String getConditionMethod() {
        return conditionMethod;
    }

    public void setConditionMethod(String conditionMethod) {
        this.conditionMethod = conditionMethod;
    }

    public Double getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(Double conditionValue) {
        this.conditionValue = conditionValue;
    }

    public Integer getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }
}
