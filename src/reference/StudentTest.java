package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKwon = new Student(1001, "아인슈타인");
        Student studentGang = new Student(1002, "갱민준");

        studentKwon.setKoreaSubject(80);
        studentKwon.setJavaSubject(100);

        studentGang.setKoreaSubject(85);
        studentGang.setJavaSubject(90);

        studentKwon.showStudentInfo();
        studentGang.showStudentInfo();

    }
}
