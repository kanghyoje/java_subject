package encapsulation;

public class PhoneStoreTest {
    public static void main(String[] args) {
        Phone phone = new Phone("아이폰", 200);
        Store store = new Store(phone);
        Customer customer = new Customer("홍길동", 200, "아이폰");
        customer.buyPhone(store);
    }
}
