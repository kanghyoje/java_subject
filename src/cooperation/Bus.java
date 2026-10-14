package cooperation;

public class Bus {
    private int busNumber;
    private int passengerCount;
    private int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take() {
        money += 1000;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println(busNumber + "번 버스의 승객은 "
                + passengerCount + "명이고, 현재 수입은 "
                + money + "입니다.");
    }
}
