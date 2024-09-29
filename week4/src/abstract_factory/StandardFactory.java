package abstract_factory;

public class StandardFactory extends Factory {

    @Override
    public Taxi createTaxi(String license) {
        Driver driver = createDriver("StandardDriver");
        return new StandardTaxi(driver, license);
    }

    @Override
    public Driver createDriver(String name) {
        return new StandardDriver(name);
    }
}
