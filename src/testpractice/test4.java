package testpractice;

public class test4 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 10; i < 51; i++) {
            if ((i % 3) == 0 && i % 5 != 0) {
                total += i;
            }
        }
        System.out.println("합계: " + total);
    }
}
