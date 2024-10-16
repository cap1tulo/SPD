package task3;

import java.util.ArrayList;
import java.util.List;

public class DriverCollection {
    private List<Driver> drivers;

    public DriverCollection() {
        drivers = new ArrayList<>();
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public DriverIterator iterator() {
        return new DriverIterator(drivers);
    }
}
