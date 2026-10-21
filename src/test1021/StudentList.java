package test1021;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        String[] name = {"강하늘", "김도영", "박영현", "안세영", "우상혁","최인호"};
        ArrayList<Student> studentList = new ArrayList<Student>();
        int i = 1101;

        for (int j = 0; j < name.length; j++) {
            studentList.add(new Student(i, name[j]));
            i++;
        }

        for (Student student : studentList) {
            student.showInfo();
        }
    }
}
