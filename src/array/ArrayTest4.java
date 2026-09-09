package array;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int num1 = numbers[1][3];
        numbers[2][1] = 4;
        int num2 = numbers[2][1];

        System.out.println(num1+ ", " + num2);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
