package prototype;

public class Main {
    public static void main(String[] args) {
        Driver originalDriver = new Driver("John Doe", "Toyota Prius", "Toyota", "35");

        Driver clonedDriver = originalDriver.clone();

        clonedDriver.setName("Jane Doe");
        clonedDriver.setCarModel("Honda Civic");

        System.out.println("Original Driver: " + originalDriver.getName() + ", Car: " + originalDriver.getCarModel());
        System.out.println("Cloned Driver: " + clonedDriver.getName() + ", Car: " + clonedDriver.getCarModel());
    }
}
