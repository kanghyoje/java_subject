package test17;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    private int num = 10001;
    private CarFactory() {}

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        return new Car(num++);
    }

}
