package polymorphsim.customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        System.out.println(customerLee.showCustomerInfo());

        Customer customerAhn = new VIPCustomer(20010, "안중근", 1011);
        System.out.println(customerAhn.showCustomerInfo());

        System.out.println("===할인율과 포인트 계산===");
        int price = 4000;
        int leePrice = customerLee.calcPrice(price);
        int ahnPrice = customerAhn.calcPrice(price);

        System.out.println(customerLee.customerName + "님이 " + leePrice + "원 지불하셨습니다.");
        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerAhn.customerName + "님이 " + ahnPrice + "원 지불하셨습니다.");
        System.out.println(customerAhn.showCustomerInfo());
    }
}
