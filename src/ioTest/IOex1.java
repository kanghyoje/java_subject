package ioTest;

import java.util.Scanner;

public class IOex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            sc.nextLine();
            total += num;
        }
        System.out.println("합계: " + total + ", 평균: " + total / 10.0);
    }
}
