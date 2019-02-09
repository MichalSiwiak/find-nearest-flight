package net.coffeecoding.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Count {
    @SerializedName("airport")
    @Expose
    private float airport;
    @SerializedName("operator")
    @Expose
    private float operator;
    @SerializedName("live")
    @Expose
    private float live;
    @SerializedName("schedule")
    @Expose
    private float schedule;
    @SerializedName("aircraft")
    @Expose
    private float aircraft;

    @Override
    public String toString() {
        return "Count{" +
                "airport=" + airport +
                ", operator=" + operator +
                ", live=" + live +
                ", schedule=" + schedule +
                ", aircraft=" + aircraft +
                '}';
    }

    public float getAirport() {
        return airport;
    }

    public void setAirport(float airport) {
        this.airport = airport;
    }

    public float getOperator() {
        return operator;
    }

    public void setOperator(float operator) {
        this.operator = operator;
    }

    public float getLive() {
        return live;
    }

    public void setLive(float live) {
        this.live = live;
    }

    public float getSchedule() {
        return schedule;
    }

    public void setSchedule(float schedule) {
        this.schedule = schedule;
    }

    public float getAircraft() {
        return aircraft;
    }

    public void setAircraft(float aircraft) {
        this.aircraft = aircraft;
    }
}
