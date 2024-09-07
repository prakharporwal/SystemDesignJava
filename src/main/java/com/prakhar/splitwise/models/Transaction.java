package com.prakhar.splitwise.models;

import java.util.List;
import java.util.Map;

public class Transaction {
    String currency;
    Double totalAmount;
    String paidByUser;
    List<String> splitAcrossUsers;

    List<Log> logs;

    Map<String, Double> splitAcrossUsersMap;


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaidByUser() {
        return paidByUser;
    }

    public void setPaidByUser(String paidByUser) {
        this.paidByUser = paidByUser;
    }

    public void setSplitAcrossUsers(List<String> splitAcrossUsers) {
        this.splitAcrossUsers = splitAcrossUsers;
    }

    public void setLogs(List<Log> logs) {
        this.logs = logs;
    }

    public void setSplitAcross(List<String> splitAcross) {
        this.splitAcrossUsers = splitAcross;
    }

    public List<String> getSplitAcrossUsers() {
        return this.splitAcrossUsers;
    }

    public void setSplitAcrossUsersMap(Map<String, Double> splitAcrossUsersMap) {
        this.splitAcrossUsersMap = splitAcrossUsersMap;
    }

    public Map<String, Double> getSplitAcrossUsersMap() {
        return this.splitAcrossUsersMap;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Log> getLogs(){
        return this.logs;
    }

    public void appendToLogs(Log log){
        this.logs.add(log);
    }
}
