package ioTest;

import java.util.Scanner;

public class IOex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1 + (i * 2); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
