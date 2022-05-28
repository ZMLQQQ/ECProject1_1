package com.ectest.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("clearing_result")
public class clearingResult {

    @TableId("result_id")
    private String resultId;
    private String business_id;
    private String trans_sn;
    private String earnings;

    @Override
    public String toString() {
        return "clearingResult{" +
                "resultId='" + resultId + '\'' +
                ", business_id='" + business_id + '\'' +
                ", trans_sn='" + trans_sn + '\'' +
                ", earnings='" + earnings + '\'' +
                '}';
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public String getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(String business_id) {
        this.business_id = business_id;
    }

    public String getTrans_sn() {
        return trans_sn;
    }

    public void setTrans_sn(String trans_sn) {
        this.trans_sn = trans_sn;
    }

    public String getEarnings() {
        return earnings;
    }

    public void setEarnings(String earnings) {
        this.earnings = earnings;
    }
}
