package net.coffeecoding.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("total")
    @Expose
    private Total total;

    @SerializedName("count")
    @Expose
    private Count count;

    @Override
    public String toString() {
        return "Stats{" +
                "total=" + total +
                ", count=" + count +
                '}';
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public Count getCount() {
        return count;
    }

    public void setCount(Count count) {
        this.count = count;
    }
}
