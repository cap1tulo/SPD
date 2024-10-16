package task4;

public class Driver {
    private Mediator mediator;

    public Driver(Mediator mediator) {
        this.mediator = mediator;
    }

    public void arriveAtPickup() {
        System.out.println("Driver: Arriving at pickup location.");
        mediator.notify(this, "ArriveAtPickup");
    }
}
