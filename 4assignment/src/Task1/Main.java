package Task1;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Client client1 = new Client("Aitas");
        Client client2 = new Client("Zhakhan");

        order.addObserver(client1);
        order.addObserver(client2);

        order.setStatus("Taxi is approaching");
        order.setStatus("Order status updated to Confirmed");
    }
}
