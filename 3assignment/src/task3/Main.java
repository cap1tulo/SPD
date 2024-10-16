package task3;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("John", "Downtown");
        Driver driver2 = new Driver("Alice", "Uptown");
        Driver driver3 = new Driver("Bob", "Suburb");

        DriverCollection driverCollection = new DriverCollection();
        driverCollection.addDriver(driver1);
        driverCollection.addDriver(driver2);
        driverCollection.addDriver(driver3);

        DriverIterator iterator = driverCollection.iterator();

        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println("Driver: " + driver.getName() + ", Location: " + driver.getLocation());
        }
    }
}
