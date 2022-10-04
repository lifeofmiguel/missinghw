package homework3;

public class RollerCoaster implements RideAble {

    private int speed;
    private final double tax = 0.20;
    private double price;

    public RollerCoaster(int speed, double price) {
        this.speed = speed;
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getTax() {
        return tax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int milesPerHour() {
        return this.speed;
    }

    public double rollerCoasterBeforeTax(){
        return price;
    }

    public double rollerCoasterTax(){
        return price * tax;
    }

    public void rollerCoasterAfterTax(){
        System.out.println(getPrice() + rollerCoasterTax());
    }
}
