package ifex;

public class ConditionEx7 {
    public static void main(String[] args) {
        int month = 8;
        String season = switch (month) {
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            case 12, 1, 2 -> "겨울";
            default -> "잘못된 입력입니다";
        };
        System.out.println(season + "입니다.");
    }
}
