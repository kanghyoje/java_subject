package classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + " " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[] args) {
        Student studentLee =  new Student();
        Student studentKim = new Student();

        studentLee.studentName = "이수연";
        studentKim.studentName = "김재윤";

        System.out.println(studentLee.studentName);
        System.out.println(studentLee.getStudentName());
        System.out.println(studentKim.getStudentName());
        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
