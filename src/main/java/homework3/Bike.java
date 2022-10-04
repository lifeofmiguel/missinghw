package homework3;

public class Bike extends Vehicle implements RideAble{

    public Bike(String name, int qty, double price, float speed) {
        super(name, qty, price, speed);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {

    }

    @Override
    public int milesPerHour() {
        return 0;
    }
}
