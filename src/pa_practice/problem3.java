package pa_practice;
import java.util.Scanner;

class Customer {
    private String name;
    private int reservedSeats;

    public Customer(String name) {
        this.name = name;
        this.reservedSeats = 0;
    }

    public void addReservation(int reservedSeats) {
        this.reservedSeats += reservedSeats;
    }

    public void showInfo() {
        System.out.println(name + ": " + reservedSeats + "석");
    }
}

class Cinema {
    private String title;
    private int availableSeats;

    public Cinema(String title, int availableSeats) {
        this.title = title;
        this.availableSeats = availableSeats;
    }

    public void reserve(Customer customer, int count) {
        if (count <= 0) {
            System.out.println("올바른 좌석 수를 입력하세요.");
        }
        else if (count > availableSeats) {
            System.out.println("예약 가능한 좌석이 부족합니다.");
        }
        else {
            availableSeats -= count;
            customer.addReservation(count);
        }
    }

    public void showInfo() {
        System.out.println("영화 제목: " + title);
        System.out.println("남은 좌석: " + availableSeats + "석");
    }
}
public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cinema cinema = new Cinema("어벤져스", 10);

        Customer customer1 = new Customer("홍길동");
        Customer customer2 = new Customer("김철수");

        int num1 = sc.nextInt();
        sc.nextLine();
        int num2 = sc.nextInt();
        sc.nextLine();

        cinema.reserve(customer1, num1);
        cinema.reserve(customer2, num2);

        System.out.println("==예약 결과==");
        customer1.showInfo();
        customer2.showInfo();
        cinema.showInfo();
    }
}
