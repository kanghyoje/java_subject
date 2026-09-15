package testpractice;

public class test7 {
    public static void main(String[] args) {
        int[] numbers = {13, 66, 34, 83, 41, 92, 23, 76};
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.print("짝수 중 가장 큰 값: " + max);
    }
}
