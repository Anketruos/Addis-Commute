package com.addiscommute;

public class TravelTimeEstimator extends BusRoute implements BusStop {

    private double averageBusSpeed;
    private double averageWalkingSpeed;
    private double trafficFactor;

    public TravelTimeEstimator(double averageBusSpeed, double averageWalkingSpeed,mdouble trafficFactor) {
    
    }

    public double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        return 0;
    }

    public double estimateWalkingTime(double distanceKm) {
        return 0;
    }

    public double estimateBusTravelTime(BusRoute route, BusStop startStop, BusStop endStop) {
        return 0;
    }

    public double estimateTotalTravelTime(BusRoute route, BusStop startStop, BusStop endStop, double userLat,double userLon) {
        return 0;
    }
}

