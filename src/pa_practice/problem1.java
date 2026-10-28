package pa_practice;

import java.util.Scanner;
class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() {
        return width * height;
    }

    public int getRerimeter() {
        return (width + height) * 2;
    }

    public void showInfo() {
        System.out.println("가로: " + width);
        System.out.println("세로: " + height);
        System.out.println("넓이: " + this.getArea());
        System.out.println("둘레: " + this.getRerimeter());
    }
}
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        sc.nextLine();
        int height = sc.nextInt();
        sc.nextLine();
        Rectangle re = new Rectangle(width, height);

        re.showInfo();
    }
}
