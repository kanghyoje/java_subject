package testpractice;

public class test15 {
    public static void main(String[] args) {
        char[] decode = {'I', ' ', 'a', 'm', ' ', 'a', ' ', 's', 'p', 'y'};
        char[] ne = new char [10];
        int index = 0;
        for (int i = decode.length - 1; i > -1; i--) {
            ne[index] = decode[i];
            index++;
        }
        for (int i = 0; i < ne.length; i++) {
            System.out.print(ne[i]);
        }
    }
}
