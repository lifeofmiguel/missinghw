package homework3;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(8);

        Car car = new Car("Car1", 1, 10.0f, engine, 60);

        RollerCoaster rollerCoaster = new RollerCoaster(60,100);

        rollerCoaster.rollerCoasterAfterTax();


    }
}
