package constructor;

public class PersonTest {
    public static void main(String[] args) {
        Person personLee = new Person("홍길동");
        Person personKim = new Person();
        Person personPark = new Person("박찬우", 180, 80);
        System.out.println(personLee.name);
        personKim.name = "김재윤";
        System.out.println(personKim.name);
        System.out.println(personPark.name + " 학생의 키는 "+ personPark.height+ "이고, 몸무게는 " + personPark.weight + "입니다.");
    }
}
