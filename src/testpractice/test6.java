package testpractice;

public class test6 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 18, 57, 24, 39, 16, 8};
        int total = 0;
        System.out.print("홀수 번째 요소: ");
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.print(numbers[i] + " ");
                total += numbers[i];
            }
        }
        System.out.println();
        System.out.println("홀수 번째 요소의 합: " + total);
    }
}
