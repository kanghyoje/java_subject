package ifex;

public class ConditionEx3 {
    public static void main(String[] args) {
        double distance = 8.5;
        String transportation;
        if (distance <= 1) {
            transportation = "도보";
        } else if (distance <= 10) {
            transportation = "자전거";
        } else if (distance <= 50) {
            transportation = "버스";
        } else {
            transportation = "기차";
        }
        System.out.println("추천 이동수단: " + transportation);
    }
}
