package net.coffeecoding.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultFlightradar{

    @SerializedName("total")
    @Expose
    private String total;

    @SerializedName("label")
    @Expose
    private String label;

    @SerializedName("detail")
    @Expose
    private Detail detail;

    @SerializedName("match")
    @Expose
    private String match;

    @SerializedName("type")
    @Expose
    private String type;

    @Override
    public String toString() {
        return "ResultFlightradar{" +
                "total='" + total + '\'' +
                ", label='" + label + '\'' +
                ", detail=" + detail +
                ", match='" + match + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
