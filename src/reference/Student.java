package reference;

public class Student {
    int studentID;
    String studentName;

    Subject korea;
    Subject java;

    public  Student (int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        korea = new Subject();
        java = new Subject();

        korea.setSubjectName("국어");
        java.setSubjectName("Java");
    }

    public void setKoreaSubject(int score) {
        korea.setScorePoint(score);
    }

    public void setJavaSubject(int score) {
        java.setScorePoint(score);
    }

    public void showStudentInfo() {
        System.out.println(studentName + "님의 " + korea.getSubjectName() + "과목의 성적은 " + korea.getScorePoint() + "점이고, " + java.getSubjectName() + "과목의 성적은 " + java.getScorePoint() + "점입니다.");
    }
}
