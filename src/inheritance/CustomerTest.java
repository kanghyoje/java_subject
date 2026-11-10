package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerKang = new Customer();
        customerKang.customerID = 10010;
        customerKang.customerName = "강민준";
        customerKang.bonusPoint = 100;
        System.out.println(customerKang.showCustomerInfo());
        int price = customerKang.calcPrice(40000);
        System.out.println(customerKang.customerName + "님이 지불해야 할 금액은 " + price + "입니다.");

        VIPCustomer customerChoi = new VIPCustomer();
        customerChoi.customerID = 10011;
        customerChoi.customerName = "최민기";
        customerChoi.bonusPoint = 20000;
        System.out.println(customerChoi.showCustomerInfo());
        int price2 = customerChoi.calcPrice(40000);
        System.out.println(customerChoi.customerName + "님이 지불해야 할 금액은 " + price2 + "입니다.");

        VIPCustomer customerKim = new VIPCustomer(10012, "김유신", 1101);
        customerKim.bonusPoint = 22000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
