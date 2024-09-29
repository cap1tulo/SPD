package abstract_factory;

public abstract class Driver {
    protected String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void drive();
}
