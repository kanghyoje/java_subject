package testpractice;

public class test1 {
    public static void main(String[] args) {
        int age = 17;
        int score = 85;
        String a;
        if (age >= 16 && score >= 80) {
            a = "통과";
        } else {
            a = "미통과";
        }
        System.out.println("나이: " + age + "\n점수: " +score +"\n결과: " + a);

    }
}
