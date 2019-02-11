package net.coffeecoding.api;

public class Address {

    /*private String country;
    private String countryCode;
    private String name;
    private String region;
    private String county;
    private String postalCode;*/
    private String formattedAddress;

    @Override
    public String toString() {
        return "Address{" +
                "formattedAddress='" + formattedAddress + '\'' +
                '}';
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }
}
