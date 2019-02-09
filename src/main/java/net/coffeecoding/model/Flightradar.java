package net.coffeecoding.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Flightradar {
    @SerializedName("results")
    @Expose
    private ArrayList<ResultFlightradar> results = new ArrayList< >();

    @SerializedName("stats")
    @Expose
    private Stats stats;

    @Override
    public String toString() {
        return "Flightradar{" +
                "results=" + results +
                ", stats=" + stats +
                '}';
    }

    public ArrayList<ResultFlightradar> getResults() {
        return results;
    }

    public void setResults(ArrayList<ResultFlightradar> results) {
        this.results = results;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}


