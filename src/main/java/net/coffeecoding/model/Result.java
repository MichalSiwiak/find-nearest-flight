package net.coffeecoding.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Result {

    @SerializedName("address_components")
    @Expose
    private ArrayList<Address> address_components = new ArrayList<>();


    @SerializedName("formatted_address")
    @Expose
    private String formatted_address;


    @SerializedName("geometry")
    @Expose
    private Geometry geometry;


    @SerializedName("place_id")
    @Expose
    private String place_id;


    @SerializedName("types")
    @Expose
    private ArrayList<String> types = new ArrayList<>();

    @Override
    public String toString() {
        return "Result{" +
                "address_components=" + address_components +
                ", formatted_address='" + formatted_address + '\'' +
                ", geometry=" + geometry +
                ", place_id='" + place_id + '\'' +
                ", types=" + types +
                '}';
    }

    public ArrayList<Address> getAddress_components() {
        return address_components;
    }

    public void setAddress_components(ArrayList<Address> address_components) {
        this.address_components = address_components;
    }

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public ArrayList<String> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<String> types) {
        this.types = types;
    }
}
