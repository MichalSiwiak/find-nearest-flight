package net.coffeecoding.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail{

    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("lon")
    @Expose
    private double lon;
    @SerializedName("schd_from")
    @Expose
    private String schd_from;
    @SerializedName("schd_to")
    @Expose
    private String schd_to;
    @SerializedName("ac_type")
    @Expose
    private String ac_type;
    @SerializedName("route")
    @Expose
    private String route;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("reg")
    @Expose
    private String reg;
    @SerializedName("callsign")
    @Expose
    private String callsign;
    @SerializedName("flight")
    @Expose
    private String flight;
    @SerializedName("operator")
    @Expose
    private String operator;

    @Override
    public String toString() {
        return "Detail{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", schd_from='" + schd_from + '\'' +
                ", schd_to='" + schd_to + '\'' +
                ", ac_type='" + ac_type + '\'' +
                ", route='" + route + '\'' +
                ", logo='" + logo + '\'' +
                ", reg='" + reg + '\'' +
                ", callsign='" + callsign + '\'' +
                ", flight='" + flight + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getSchd_from() {
        return schd_from;
    }

    public void setSchd_from(String schd_from) {
        this.schd_from = schd_from;
    }

    public String getSchd_to() {
        return schd_to;
    }

    public void setSchd_to(String schd_to) {
        this.schd_to = schd_to;
    }

    public String getAc_type() {
        return ac_type;
    }

    public void setAc_type(String ac_type) {
        this.ac_type = ac_type;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
