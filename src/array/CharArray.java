package array;

public class CharArray {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        char num = 'A';

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (num + i);
            System.out.println(alphabet[i] + "," + (int) (num + i));
        }
    }
}