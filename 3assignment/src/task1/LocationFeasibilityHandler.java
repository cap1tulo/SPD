package task1;

public class LocationFeasibilityHandler extends Handler {
    @Override
    public void handleRequest(ClientRequest request) {
        if (request.isLocationFeasible()) {
            System.out.println("Request approved: All checks passed. Dispatching car.");
        } else {
            System.out.println("Request rejected: Location is not feasible.");
        }
    }
}
