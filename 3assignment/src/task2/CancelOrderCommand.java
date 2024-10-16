package task2;

public class CancelOrderCommand implements Command {
    private TaxiOrder order;

    public CancelOrderCommand(TaxiOrder order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.cancel();
    }
}
