package test1021;

public class Student {
    int studentID;
    String name;

    public Student (int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }
    public void showInfo() {
        System.out.println("학번: " + studentID + ", 이름: " + name);
    }
}
