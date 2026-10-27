package ioTest;

import java.util.Scanner;

public class IOex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            sc.nextLine();
            nums[i] = num;
        }
        for (int num: nums) {
            System.out.print(num + " ");
        }
    }
}
