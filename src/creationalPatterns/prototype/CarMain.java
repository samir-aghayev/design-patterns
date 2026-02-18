package creationalPatterns.prototype;

public class CarMain {
    static void main() {
        Car car = new Car();
        car.setModel("Mercedes");
        car.setColor("black");
        car.setMaxSpeed(15);
        car.getParts().add("engine");
        car.getParts().add("wheels");
        car.getParts().add("doors");
        car.getParts().add("seats");

        System.out.println(car);

        Car car2 = car.clone();
        System.out.println(car2);

        System.out.println(car == car2);

        car2.getParts().remove("doors");

        System.out.println(car);
        System.out.println(car2);

        Car car3 = new Car(null);

        System.out.println(car3);

    }
}
