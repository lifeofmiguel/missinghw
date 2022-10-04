package homework3;

public class Car extends Vehicle{
    public Car(String name, int qty, double price, Engine myEngine, float speed) {
        super(name, qty, price, myEngine, speed);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {

    }
}
