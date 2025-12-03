package com.addiscommute;

import java.util.List;

public class BusRoute {

    private String routeId;
    private String routeName;
    private List<BusStop> stops;
    private double totalDistance;

    public BusRoute(String routeId, String routeName) {
    }
    public void addStop(BusStop stop) {
    }
    public List<BusStop> getStops() {

        return null;
    }
    public boolean isStopOnRoute(BusStop stop) {

        return false;
    }

    public double calculateRouteDistance() {
        return 0.0;
    }
    public void displayRouteDetails() {
    }
}
