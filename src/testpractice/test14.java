package testpractice;

public class test14 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                total += i;
            }
        }
        System.out.print(total);
    }
}
