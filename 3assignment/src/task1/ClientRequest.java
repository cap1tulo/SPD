package task1;

public class ClientRequest {
    private boolean sufficientBalance;
    private boolean carAvailable;
    private boolean locationFeasible;

    public ClientRequest(boolean sufficientBalance, boolean carAvailable, boolean locationFeasible) {
        this.sufficientBalance = sufficientBalance;
        this.carAvailable = carAvailable;
        this.locationFeasible = locationFeasible;
    }

    public boolean hasSufficientBalance() {
        return sufficientBalance;
    }

    public boolean isCarAvailable() {
        return carAvailable;
    }

    public boolean isLocationFeasible() {
        return locationFeasible;
    }
}
