package task2;

public class CreateOrderCommand implements Command {
    private TaxiOrder order;

    public CreateOrderCommand(TaxiOrder order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.create();
    }
}
