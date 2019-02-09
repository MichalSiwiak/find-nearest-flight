package net.coffeecoding.api;

import java.net.URL;

public class Response {

    private String callsign;
    private long distanceFromAircraft;
    private Location aircraftLocation;
    private Location pointLocation;
    private Address address;
    private String flightFrom;
    private String flightTo;
    private String aircraftType;
    private String route;
    private URL photo;

    @Override
    public String toString() {
        return "Response{" +
                "callsign='" + callsign + '\'' +
                ", distanceFromAircraft=" + distanceFromAircraft +
                ", aircraftLocation=" + aircraftLocation +
                ", pointLocation=" + pointLocation +
                ", address=" + address +
                ", flightFrom='" + flightFrom + '\'' +
                ", flightTo='" + flightTo + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                ", route='" + route + '\'' +
                ", photo=" + photo +
                '}';
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public long getDistanceFromAircraft() {
        return distanceFromAircraft;
    }

    public void setDistanceFromAircraft(long distanceFromAircraft) {
        this.distanceFromAircraft = distanceFromAircraft;
    }

    public Location getAircraftLocation() {
        return aircraftLocation;
    }

    public void setAircraftLocation(Location aircraftLocation) {
        this.aircraftLocation = aircraftLocation;
    }

    public Location getPointLocation() {
        return pointLocation;
    }

    public void setPointLocation(Location pointLocation) {
        this.pointLocation = pointLocation;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public void setFlightFrom(String flightFrom) {
        this.flightFrom = flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public void setFlightTo(String flightTo) {
        this.flightTo = flightTo;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public URL getPhoto() {
        return photo;
    }

    public void setPhoto(URL photo) {
        this.photo = photo;
    }
}
