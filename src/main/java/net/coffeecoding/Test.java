package net.coffeecoding;

import net.coffeecoding.api.Response;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<ObjectTemp> objectTemps = new ArrayList<>();


        Response response = new Response();

        String name = objectTemps.get(0).getName();
        response.setMessage(((name == null) ? "N/A" : name));

    }
}


class ObjectTemp {
    private String name;
    private double number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
