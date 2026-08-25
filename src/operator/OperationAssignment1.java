package operator;

public class OperationAssignment1 {
    public static void main(String[] args) {
        double var1 = 2.5;
        double var2 = 3.5;
        double var3 = 6.5;
        double sum = var1 + var2 + var3;
        double avg = sum / 3;
        System.out.printf("합계:%.1f", sum);
        System.out.println();
        System.out.printf("평균:%.1f", avg);
    }
}
