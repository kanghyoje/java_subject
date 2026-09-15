package testpractice;

public class test14 {
    public static void main(String[] args) {

        long total = 0l;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                total += i;
            }
        }
        System.out.print(total);
    }
}
