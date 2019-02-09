package net.coffeecoding.model;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class TestGeocode {


    public static void main(String[] args) throws MalformedURLException {


        String string = "zamość";

        URL url = new URL("https://maps.googleapis.com/maps/api/geocode/json?address=" + string + "&key=AIzaSyCOBqf1LYN9p_LH-sTWAjg2jXCX_RWfsUI");
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(url.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Geocode geocode = new Gson().fromJson(reader, Geocode.class);


        System.out.println(geocode.toString());


        ArrayList<Result> results = geocode.getResults();

        for (Result result : results) {
            System.out.println(result.getGeometry().getLocation().getLat());
            System.out.println(result.getGeometry().getLocation().getLng());
            System.out.println(result.getGeometry().getLocation_type());
            System.out.println(result.getGeometry().getViewport().getNortheast().getLat());
            System.out.println(result.getGeometry().getViewport().getNortheast().getLat());
            System.out.println(result.getGeometry().getViewport().getSouthwest().getLat());
            System.out.println(result.getGeometry().getViewport().getSouthwest().getLng());
            System.out.println(result.getFormatted_address());
            System.out.println(result.getPlace_id());
            ArrayList<String> types = result.getTypes();

            for (String type : types) {
                System.out.println(type);
            }


            ArrayList<Address> address_components = result.getAddress_components();
            for (Address address_component : address_components) {
                System.out.println(address_component.getLong_name());
                System.out.println(address_component.getShort_name());

                ArrayList<String> types1 = address_component.getTypes();
                System.out.println(types1);
            }


        }


    }
}
