package com.example.bbws;

import com.google.gson.annotations.SerializedName;

public class remote_monitoring {
    @SerializedName("id")
    private int id;
    @SerializedName("rain")
    private int rain;
    @SerializedName("hour")
    private int hour;
    @SerializedName("solar")
    private int solar;
    @SerializedName("wind")
    private int wind;
    @SerializedName("temp")
    private int temp;
    @SerializedName("rh")
    private int rh;
    @SerializedName("wl")
    private int wl;
    @SerializedName("flow")
    private int flow;
    @SerializedName("date")
    private int date;
    public RemoteMonitoring() {}
    public RemoteMonitoring(int id, int rain, int hour, int solar, int wind, int temp, int rh, int wl, int flow, int date) {
        this.id = id;
        this.rain = rain;
        this.hour = hour;
        this.solar = solar;
        this.wind = wind;
        this.temp = temp;
        this.rh = rh;
        this.wl = wl;
        this.flow = flow;
        this.date = date;
    }
    public String getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getRain() {
        return rain;
    }
    public void setRain(int rain) {
        this.rain = rain;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getSolar() {
        return solar;
    }
    public void setSolar(int Solar) {
        this.solar = solar;
    }
    public int getWind() {
        return wind;
    }
    public void setWind(int wind) {
        this.wind = wind;
    }
    public int getTemp() {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }
    public int getRh() {
        return rh;
    }
    public void setRh(int rh) {
        this.rh = rh;
    }
    public int getWl() {
        return wl;
    }
    public void setWl(int wl) {
        this.wl = wl;
    }
    public int getFlow() {
        return flow;
    }
    public void setFlow(int flow) {
        this.flow = flow;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
}
