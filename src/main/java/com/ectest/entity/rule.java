package com.ectest.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("clearing_rule")
public class rule {
    @TableId("rule_id")
    private String ruleId;
    @TableField("rule_type")
    private String ruleType;
    @TableField("trans_channel")
    private String transChannel;
    @TableField("trans_type")
    private String transType;
    @TableField("business_id")
    private String businessId;
    private String ratio;
    @TableField("status")
    private String status;
    @TableField("creat_by")
    private String creatBy;
    @TableField("update_time")
    private Date updateTime;
    @TableField("remark")
    private String remark;


    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public String getTransChannel() {
        return transChannel;
    }

    public void setTransChannel(String transChannel) {
        this.transChannel = transChannel;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    @Override
    public String toString() {
        return "rule{" +
                "ruleId='" + ruleId + '\'' +
                ", ruleType='" + ruleType + '\'' +
                ", transChannel='" + transChannel + '\'' +
                ", transType='" + transType + '\'' +
                ", businessId='" + businessId + '\'' +
                ", ratio='" + ratio + '\'' +
                ", status='" + status + '\'' +
                ", creatBy='" + creatBy + '\'' +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                '}';
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(String creatBy) {
        this.creatBy = creatBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
