package net.coffeecoding.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Viewport {

    @SerializedName("northeast")
    @Expose
    private Location northeast;

    @SerializedName("southwest")
    @Expose
    private Location southwest;

    @Override
    public String toString() {
        return "Viewport{" +
                "northeast=" + northeast +
                ", southwest=" + southwest +
                '}';
    }

    public Location getNortheast() {
        return northeast;
    }

    public void setNortheast(Location northeast) {
        this.northeast = northeast;
    }

    public Location getSouthwest() {
        return southwest;
    }

    public void setSouthwest(Location southwest) {
        this.southwest = southwest;
    }
}
