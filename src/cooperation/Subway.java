package cooperation;

public class Subway {
    private int lineNumber;
    private int passengerCount;
    private int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take() {
        money += 1500;
        passengerCount ++;
    }

    public void showInfo() {
        System.out.println(lineNumber + "번 버스의 승객은 "
                + passengerCount + "명이고, 현재 수입은 "
                + money + "입니다.");
    }
}
