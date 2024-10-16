package task2;

public class Main {
    public static void main(String[] args) {
        TaxiOrder order = new TaxiOrder("Central Park");

        Command createOrder = new CreateOrderCommand(order);
        Command cancelOrder = new CancelOrderCommand(order);
        Command changeDestination = new ChangeDestinationCommand(order, "Times Square");

        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setCreateOrderCommand(createOrder);
        dispatcher.setCancelOrderCommand(cancelOrder);
        dispatcher.setChangeDestinationCommand(changeDestination);

        dispatcher.createOrder();
        dispatcher.changeDestination();
        dispatcher.cancelOrder();
    }
}
