package testpractice;

public class test5 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                numbers[index++] = (i+1) * 2;
            } else {
                numbers[index++] = (i+2) * 3;
            }
        }
        System.out.print("numbers 배열에 저장된 값: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
