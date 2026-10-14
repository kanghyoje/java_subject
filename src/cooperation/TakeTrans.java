package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student student = new Student("강호동", 10000);
        Student student1 = new Student("류상근", 20000);
        Bus bus = new Bus(2000);
        Subway subway = new Subway(100);

        student.getBus(bus);
        student1.getSubway(subway);

        student.showInfo();
        student1.showInfo();

        bus.showInfo();
        subway.showInfo();
    }
}
