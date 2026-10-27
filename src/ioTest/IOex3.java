package ioTest;

import java.util.Scanner;

public class IOex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = new char[10];
        for (int i = 0; i < 10; i++) {
            char text = sc.next().charAt(0);
            chars[i] = text;
        }
        for (char text : chars) {
            System.out.print(text + " ");
        }
    }
}
