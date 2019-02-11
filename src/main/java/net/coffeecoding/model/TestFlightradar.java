package net.coffeecoding.model;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;

import net.coffeecoding.model.flightradar.Flightradar;
import net.coffeecoding.model.flightradar.ResultFlightradar;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class TestFlightradar {

    public static void main(String[] args) {

        String string = "WZZ8WV  ";
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("https://www.flightradar24.com/v1/search/web/find?query=" + string.trim());

        try {
            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            // Read the contents of an entity and return it as a String.
            String content = EntityUtils.toString(entity);
            Flightradar flightradar = new Gson().fromJson(content, Flightradar.class);
            System.out.println(flightradar.getStats().toString());
            ArrayList<ResultFlightradar> results = flightradar.getResults();
            System.out.println(flightradar.getResults().get(0).getDetail().getRoute());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

