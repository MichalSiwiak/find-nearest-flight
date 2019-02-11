package net.coffeecoding.model.geocode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Geocode {
    @SerializedName("results")
    @Expose
    ArrayList<Result> results = new ArrayList<>();
    @SerializedName("status")
    @Expose
    private String status;

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Codebeautify{" +
                "results=" + results +
                ", status='" + status + '\'' +
                '}';
    }
}


