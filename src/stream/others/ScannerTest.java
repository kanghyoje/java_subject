package stream.others;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("사원번호: ");
        int sID = sc.nextInt();
        sc.nextLine();

        System.out.print("직업: ");
        String job= sc.nextLine();

        System.out.println("이름: " + name);
        System.out.println("사원번호: " + sID);
        System.out.println("직업: " + job);
    }
}
