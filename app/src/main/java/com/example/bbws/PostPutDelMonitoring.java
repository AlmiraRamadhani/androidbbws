package com.example.bbws;

import com.google.gson.annotations.SerializedName;

public class PostPutDelMonitoring {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    remote_monitoring mMonitoring;
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
    public remote_monitoring getmMonitoring() {
        return mMonitoring;
    }
    public void setPembelian(remote_monitoring monitoring) {
        mMonitoring = monitoring;
    }
}
    }
