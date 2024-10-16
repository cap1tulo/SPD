package task2;

public class TaxiOrder {
    private String destination;

    public TaxiOrder(String destination) {
        this.destination = destination;
    }

    public void create() {
        System.out.println("Order created for destination: " + destination);
    }

    public void cancel() {
        System.out.println("Order canceled for destination: " + destination);
    }

    public void changeDestination(String newDestination) {
        this.destination = newDestination;
        System.out.println("Order destination changed to: " + newDestination);
    }
}
