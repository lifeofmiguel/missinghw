package homework3;

public abstract class Vehicle extends Product{
    private int qty;
    private double price;
    private Engine myEngine;
    private final double tax = 0.15;
    private float speed;

    public Vehicle(String name, int qty, double price, float speed) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.speed = speed;
    }

    public Vehicle(String name, int qty, double price, Engine myEngine, float speed) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.myEngine = myEngine;
        this.speed = speed;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getMyEngine() {
        return myEngine;
    }

    public void setMyEngine(Engine myEngine) {
        this.myEngine = myEngine;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public double totalBeforeTax(Vehicle vehicle){
        return 0;
    }

    public double calcTax(Vehicle vehicle){
        return 0;
    }

    public abstract void totalAfterTax(Vehicle vehicle);



}
