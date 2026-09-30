package thisdemo;

public class CallAnotherConst {
    public static void main(String[] args) {
        Person person = new Person("이름있음",15);

        System.out.println(person.name);
        System.out.println(person.age);

        System.out.println(person.returnItSelf());
        System.out.println(person);
    }
}
