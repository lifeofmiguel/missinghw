package homework3;

public class Truck extends Vehicle{
    public Truck(String name, int qty, double price, Engine myEngine, float speed) {
        super(name, qty, price, myEngine, speed);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {

    }
}
