package com.ectest.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("clearing_rule")
public class rule {
    private String rule_id;
    private String rule_type;
    private String trans_channel;
    private String trans_type;
    private String business_id;
    private String ratio;
    private String status;
    @TableField("creat_by")
    private String creat_by;
    @TableField("update_time")
    private Date update_time;
    @TableField("remark")
    private String remark;

    @Override
    public String toString() {
        return "rule{" +
                "rule_id='" + rule_id + '\'' +
                ", rule_type='" + rule_type + '\'' +
                ", trans_channel='" + trans_channel + '\'' +
                ", trans_type='" + trans_type + '\'' +
                ", business_id='" + business_id + '\'' +
                ", ratio='" + ratio + '\'' +
                ", status='" + status + '\'' +
                ", creat_by='" + creat_by + '\'' +
                ", update_time=" + update_time +
                ", remark='" + remark + '\'' +
                '}';
    }

    public String getRule_id() {
        return rule_id;
    }

    public void setRule_id(String rule_id) {
        this.rule_id = rule_id;
    }

    public String getRule_type() {
        return rule_type;
    }

    public void setRule_type(String rule_type) {
        this.rule_type = rule_type;
    }

    public String getTrans_channel() {
        return trans_channel;
    }

    public void setTrans_channel(String trans_channel) {
        this.trans_channel = trans_channel;
    }

    public String getTrans_type() {
        return trans_type;
    }

    public void setTrans_type(String trans_type) {
        this.trans_type = trans_type;
    }

    public String getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(String business_id) {
        this.business_id = business_id;
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

    public String getCreat_by() {
        return creat_by;
    }

    public void setCreat_by(String creat_by) {
        this.creat_by = creat_by;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
