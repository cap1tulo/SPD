package task3;

import java.util.List;

public class DriverIterator {
    private List<Driver> drivers;
    private int position;

    public DriverIterator(List<Driver> drivers) {
        this.drivers = drivers;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < drivers.size();
    }

    public Driver next() {
        return drivers.get(position++);
    }
}
