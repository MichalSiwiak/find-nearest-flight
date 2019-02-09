package net.coffeecoding.api;

public class Address {

    private String country;
    private String countryCode;
    private String name;
    private String region;
    private String county;
    private String postalCode;
    private String formattedAddress;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", county='" + county + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", formattedAddress='" + formattedAddress + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }
}
