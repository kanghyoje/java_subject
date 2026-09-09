package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[][] score = new int[][]{{89, 76, 100, 68, 48, 98, 56, 77, 95}, {50, 60, 70,
                100, 99, 88, 83, 78, 93}};
        double total1 = 0;
        double total2 = 0;

        for (int i = 0; i < score[0].length; i++) {
            total1 += score[0][i];
        }
        for (int i = 0; i < score[1].length; i++) {
            total2 += score[1][i];
        }

        System.out.printf("A반의 평균: "+ "%.1f", total1 / score[0].length);
        System.out.println();
        System.out.printf("B반의 평균: " + "%.1f", total2 / score[0].length);
    }
}
