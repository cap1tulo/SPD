package task4;

public class DispatcherMediator implements Mediator {
    private Client client;
    private Driver driver;
    private Dispatcher dispatcher;

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void notify(Object sender, String event) {
        if (sender instanceof Client && event.equals("RequestRide")) {
            System.out.println("Mediator: Client requested a ride.");
            dispatcher.processRideRequest();
        } else if (sender instanceof Driver && event.equals("ArriveAtPickup")) {
            System.out.println("Mediator: Driver has arrived at pickup.");
            dispatcher.notifyDriverArrival();
        }
    }
}
