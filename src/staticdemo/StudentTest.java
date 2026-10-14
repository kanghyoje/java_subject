package staticdemo;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setStudentName("류예준");
        System.out.println(student1.getStudentName() + student1.getStudentID());
        System.out.println(Student.serialNum);


        student2.setStudentName("류상근");
        System.out.println(student2.getStudentName() + student2.getStudentID());


        System.out.println(student1.getStudentName() + student1.getStudentID());

    }
}
