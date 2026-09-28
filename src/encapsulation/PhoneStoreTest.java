package encapsulation;

public class PhoneStoreTest {
    public static void main(String[] args) {
        Phone phone = new Phone("아이폰", 200);
        Store store = new Store(phone);
    }
}
