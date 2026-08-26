package ifex;

public class IfEx4 {
    public static void main(String[] args) {
        int month = 67;
        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> {
                System.out.println("가장 짧은 달입니다.");
                yield 28;
            }
            case 4, 6, 9, 11 -> 30;
            default -> {
                System.out.println("해당하는 달이 없습니다.");
                yield 0;
            }
        };

        System.out.println(month + "월의 날짜는 총 " + day + "일입니다.");
    }
}
