package reference;

public class Student {
    int studentID;
    String studentName;

    Subject korea = new Subject();
    Subject java = new Subject();

    public  Student (int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }
}
