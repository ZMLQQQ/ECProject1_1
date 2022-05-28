package com.ectest.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("trans_record")
public class transRecord {
    @TableId("trans_type")
    private String transType;
    @TableId("card_no")
    private String cardNo;
    @TableId("card_sn")
    private String cardSn;
    @TableId("trans_time")
    private Date transTime;
    private String trans_sn;
    private String trans_channel;
    private String ticket_type;
    private String trans_amount;
    private String balance;
    private String deposit;
    private String discount;
    private String penalty_excess;
    private String user_id;
    private String line_id;
    private String station_id;
    private String last_station_id;
    private String vehicle_id;
    private String terminal_no;
    private String terminal_sn;
    private String terminal_ip;
    private String terminal_trans_index;
    private String offline_trans_type;
    private String offline_trans_index;
    private String tac;
    private String city_code;
    private String card_issuer;

    @Override
    public String toString() {
        return "transRecord{" +
                "transType='" + transType + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", cardSn='" + cardSn + '\'' +
                ", transTime=" + transTime +
                ", trans_sn='" + trans_sn + '\'' +
                ", trans_channel='" + trans_channel + '\'' +
                ", ticket_type='" + ticket_type + '\'' +
                ", trans_amount='" + trans_amount + '\'' +
                ", balance='" + balance + '\'' +
                ", deposit='" + deposit + '\'' +
                ", discount='" + discount + '\'' +
                ", penalty_excess='" + penalty_excess + '\'' +
                ", user_id='" + user_id + '\'' +
                ", line_id='" + line_id + '\'' +
                ", station_id='" + station_id + '\'' +
                ", last_station_id='" + last_station_id + '\'' +
                ", vehicle_id='" + vehicle_id + '\'' +
                ", terminal_no='" + terminal_no + '\'' +
                ", terminal_sn='" + terminal_sn + '\'' +
                ", terminal_ip='" + terminal_ip + '\'' +
                ", terminal_trans_index='" + terminal_trans_index + '\'' +
                ", offline_trans_type='" + offline_trans_type + '\'' +
                ", offline_trans_index='" + offline_trans_index + '\'' +
                ", tac='" + tac + '\'' +
                ", city_code='" + city_code + '\'' +
                ", card_issuer='" + card_issuer + '\'' +
                ", out_trade_no='" + out_trade_no + '\'' +
                '}';
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardSn() {
        return cardSn;
    }

    public void setCardSn(String cardSn) {
        this.cardSn = cardSn;
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    public String getTrans_sn() {
        return trans_sn;
    }

    public void setTrans_sn(String trans_sn) {
        this.trans_sn = trans_sn;
    }

    public String getTrans_channel() {
        return trans_channel;
    }

    public void setTrans_channel(String trans_channel) {
        this.trans_channel = trans_channel;
    }

    public String getTicket_type() {
        return ticket_type;
    }

    public void setTicket_type(String ticket_type) {
        this.ticket_type = ticket_type;
    }

    public String getTrans_amount() {
        return trans_amount;
    }

    public void setTrans_amount(String trans_amount) {
        this.trans_amount = trans_amount;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getPenalty_excess() {
        return penalty_excess;
    }

    public void setPenalty_excess(String penalty_excess) {
        this.penalty_excess = penalty_excess;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getLine_id() {
        return line_id;
    }

    public void setLine_id(String line_id) {
        this.line_id = line_id;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getLast_station_id() {
        return last_station_id;
    }

    public void setLast_station_id(String last_station_id) {
        this.last_station_id = last_station_id;
    }

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getTerminal_no() {
        return terminal_no;
    }

    public void setTerminal_no(String terminal_no) {
        this.terminal_no = terminal_no;
    }

    public String getTerminal_sn() {
        return terminal_sn;
    }

    public void setTerminal_sn(String terminal_sn) {
        this.terminal_sn = terminal_sn;
    }

    public String getTerminal_ip() {
        return terminal_ip;
    }

    public void setTerminal_ip(String terminal_ip) {
        this.terminal_ip = terminal_ip;
    }

    public String getTerminal_trans_index() {
        return terminal_trans_index;
    }

    public void setTerminal_trans_index(String terminal_trans_index) {
        this.terminal_trans_index = terminal_trans_index;
    }

    public String getOffline_trans_type() {
        return offline_trans_type;
    }

    public void setOffline_trans_type(String offline_trans_type) {
        this.offline_trans_type = offline_trans_type;
    }

    public String getOffline_trans_index() {
        return offline_trans_index;
    }

    public void setOffline_trans_index(String offline_trans_index) {
        this.offline_trans_index = offline_trans_index;
    }

    public String getTac() {
        return tac;
    }

    public void setTac(String tac) {
        this.tac = tac;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getCard_issuer() {
        return card_issuer;
    }

    public void setCard_issuer(String card_issuer) {
        this.card_issuer = card_issuer;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    private String out_trade_no;

}
