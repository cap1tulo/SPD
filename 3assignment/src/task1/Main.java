package task1;

public class Main {
    public static void main(String[] args) {
        ClientRequest request = new ClientRequest(true, true, true);

        Handler balanceHandler = new BalanceCheckHandler();
        Handler availabilityHandler = new CarAvailabilityHandler();
        Handler locationHandler = new LocationFeasibilityHandler();

        balanceHandler.setNextHandler(availabilityHandler);
        availabilityHandler.setNextHandler(locationHandler);

        balanceHandler.handleRequest(request);
    }
}
