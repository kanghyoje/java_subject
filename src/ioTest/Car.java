package ioTest;

public class Car {
    private String model;
    private String color;
    private int price;

    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void showCar() {
        System.out.println("모델: " + model);
        System.out.println("색상: " + color);
        System.out.println("가격: " + price);
    }
}
