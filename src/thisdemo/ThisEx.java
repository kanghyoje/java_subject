package thisdemo;

public class ThisEx {
    public static void main(String[] args) {
        BirthDay birthDay = new BirthDay();

        birthDay.setYear(2000);

        System.out.println(birthDay);
        birthDay.printThis();
    }

}
