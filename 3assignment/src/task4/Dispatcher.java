package task4;

public class Dispatcher {
    private Mediator mediator;

    public Dispatcher(Mediator mediator) {
        this.mediator = mediator;
    }

    public void processRideRequest() {
        System.out.println("Dispatcher: Processing ride request.");
    }

    public void notifyDriverArrival() {
        System.out.println("Dispatcher: Notifying that the driver has arrived.");
    }
}
