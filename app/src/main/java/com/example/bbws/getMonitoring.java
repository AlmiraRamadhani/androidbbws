package com.example.bbws;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class getMonitoring {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    List<remote_monitoring> listDataMonitoring;
    @SerializedName("message")
    String message;


    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public List<remote_monitoring> getListDataMonitoring() {
        return listDataMonitoring;
    }
    public void setListDataPembelien(List<remote_monitoring> listDataMonitoring) {
        this.listDataMonitoring = listDataMonitoring;
    }
}
