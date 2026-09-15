package testpractice;

public class test2 {
    public static void main(String[] args) {
        int score = 86;
        System.out.println("점수: " + score);

        char a;
        switch (score / 10) {
            case 10, 9 -> a ='A';
            case 8 -> a = 'B';
            case 7 -> a = 'C';
            default -> a = 'D';
        }
        System.out.println("등급: " + a);
    }
}
