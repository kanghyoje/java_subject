package ifex;

public class ConditionEx9 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        char op = '/';

        switch (op) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나누는 것은 불가능합니다.");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                break;
        }
    }
}
