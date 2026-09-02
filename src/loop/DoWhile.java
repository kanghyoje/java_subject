package loop;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;
        do {
            result += i;
            i++;
        } while (i <= 10);
        System.out.println("1부터 10까지의 합은 " + result + "입니다.");
    }
}
