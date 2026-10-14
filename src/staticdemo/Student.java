package staticdemo;

public class Student {
    public static int serialNum = 1200;

    private String studentName;
    private int studentID;
    private int grade;
    private String address;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }

    public int getStudentID() {
        return studentID;
    }

    public static int getSerialNum() {
        int i = 10;
//        studentName = "전아현";
        return serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
