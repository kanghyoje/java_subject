package thisdemo;

public class ReturnItSelf {
    public static void main(String[] args) {
        Student student = new Student();

//        Student student1 = student.setId(1206);
//        Student student2 = student1.setName("강효제");
//        Student student3 = student2.setGrade(1);

        student.setId(1206).setName("강효제").setGrade(1).showStudentInfo();
    }
}
