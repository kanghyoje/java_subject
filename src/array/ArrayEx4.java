package array;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] arr = new int[]{89, 76, 100, 68, 48, 98, 56, 77, 95};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println( total);
        System.out.printf("%.1f", (double) total / arr.length);
    }
}
