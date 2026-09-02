package loop;

public class WhileEx2 {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;
        while (i < 11) {
            result += i;
            i++;
        }
        System.out.println("-1부터 10까지의 합은 " + result + "입니다.");
    }
}
