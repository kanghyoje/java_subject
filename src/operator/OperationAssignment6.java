package operator;

public class OperationAssignment6 {
    public static void main(String[] args) {
        int kor = 85;
        int eng = 90;
        int math = 78;
        int total = kor + eng + math;
        double avg = (double) total / 3;
        boolean pass = (avg >= 80) ? true: false;
        System.out.println("합계:" + total);
        System.out.printf("평균:%.1f", avg);
        System.out.println();
        System.out.println("결과:" + ((pass)? "통과": "미통과"));

    }
}
