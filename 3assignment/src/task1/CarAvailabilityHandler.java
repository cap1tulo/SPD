package task1;

public class CarAvailabilityHandler extends Handler {
    @Override
    public void handleRequest(ClientRequest request) {
        if (request.isCarAvailable()) {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("Request rejected: No cars available.");
        }
    }
}
