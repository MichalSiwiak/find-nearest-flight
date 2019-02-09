package net.coffeecoding.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geometry {


    @SerializedName("location")
    @Expose
    private Location location;

    @SerializedName("location_type")
    @Expose
    private String location_type;

    @SerializedName("viewport")
    @Expose
    private Viewport viewport;

    @Override
    public String toString() {
        return "Geometry{" +
                "location=" + location +
                ", location_type='" + location_type + '\'' +
                ", viewport=" + viewport +
                '}';
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public Viewport getViewport() {
        return viewport;
    }

    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }
}
