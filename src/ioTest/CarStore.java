package ioTest;

import java.util.Scanner;

public class CarStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] cars = new Car[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("차종/색상/가격을 순서대로 입력해주세요.");
            String model = sc.nextLine();
            String color = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();

            cars[i] = new Car(model, color, price);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("보유차량" + (i + 1));
            cars[i].showCar();
        }
    }
}
