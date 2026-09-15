package testpractice;

public class test8 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(a++ + " ");
                }
                System.out.println();
            } else {
                int b = a + 4;
                for (int j = 0; j < 5; j++) {
                    System.out.print(b-- + " ");
                }
                System.out.println();
            }
        }
    }
}
