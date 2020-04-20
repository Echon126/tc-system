package com.tianta.tc.db.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author ZKTT
 */
public class TcRule implements Serializable {
    private static final long serialVersionUID = 3145346214722961249L;

    private Integer id;
    private String mid;
    private String ruleName;
    private String ruleCode;
    private String ruleExpression;
    private String ruleDesc;
    private Integer isDefault;
    private Date createTime;

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

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public String getRuleExpression() {
        return ruleExpression;
    }

    public void setRuleExpression(String ruleExpression) {
        this.ruleExpression = ruleExpression;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TcRule tcRule = (TcRule) o;
        return Objects.equals(id, tcRule.id) &&
                Objects.equals(mid, tcRule.mid) &&
                Objects.equals(ruleName, tcRule.ruleName) &&
                Objects.equals(ruleCode, tcRule.ruleCode) &&
                Objects.equals(ruleExpression, tcRule.ruleExpression) &&
                Objects.equals(ruleDesc, tcRule.ruleDesc) &&
                Objects.equals(isDefault, tcRule.isDefault) &&
                Objects.equals(createTime, tcRule.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mid, ruleName, ruleCode, ruleExpression, ruleDesc, isDefault, createTime);
    }
}
