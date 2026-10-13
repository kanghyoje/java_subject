package cooperation;

public class Student {
    private String studentName;
    private int grade;
    private int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void getBus(Bus bus) {
        this.money -= 1000;
    }

    public void getSubway(Subway subway) {
        this.money -= 1500;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 잔액은 " + money + "입니다.");
    }
}
