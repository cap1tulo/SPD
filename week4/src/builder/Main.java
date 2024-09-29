package builder;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver.DriverBuilder()
                .withName("Johnny Silverhand")
                .withCarModel("Porsche 911")
                .withLicenseNumber("XYZ12345")
                .withExperienceYears(5)
                .isAvailable(true)
                .build();

        System.out.println(driver);
    }
}
