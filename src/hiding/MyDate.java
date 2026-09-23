package hiding;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public void setDay(int year, int month, int day) {
        if (month == 2) {
            if (day < 1 || day > 28) {
                System.out.println("잘못 입력하셨습니다.");
            } else {
                this.year = year;
                this.month = month;
                this.day = day;
            }
        }
    }
}
