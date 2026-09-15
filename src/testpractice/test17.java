package testpractice;

public class test17 {
    public static void main(String[] args) {
        int[][] score = {
                {80, 90, 100},
                {74, 100, 88},
                {65, 77, 90},
                {45, 76, 82},
                {98, 100, 92}
        };
        String[] subName = {"국어", "영어", "수학"};

        for (int i = 0; i < subName.length; i++) {
            int total = 0;
            for (int j = 0; j < score.length; j++) {
                total += score[j][i];
            }
            System.out.println(subName[i] + ": " + total / 5.0);
        }
    }
}
