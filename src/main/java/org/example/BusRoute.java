import java.util.List;

public class BusRoute {

    private String routeId;
    private String routeName;
    private List<BusStop> stops;
    private double totalDistance;

    public BusRoute(String routeId, String routeName) {
        // constructor body
    }

    // Add stop to the route
    public void addStop(BusStop stop) {
        // method body
    }

    // 1. getStops()
    // Returns all stops in order
    public List<BusStop> getStops() {
        // method body
        return null;
    }

    // 2. isStopOnRoute(stop)
    // Checks if stop exists on this route
    public boolean isStopOnRoute(BusStop stop) {
        // method body
        return false;
    }

    // 3. calculateRouteDistance()
    // Calculates total distance of the route
    public double calculateRouteDistance() {
        // method body
        return 0.0;
    }

    // 4. displayRouteDetails()
    // Shows route name, stops, and distance
    public void displayRouteDetails() {
        // method body
    }
}
