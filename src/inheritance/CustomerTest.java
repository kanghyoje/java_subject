package inheritance;

public class CustomerTest {
    public static void main(String[] args) {

        VIPCustomer customerChoi = new VIPCustomer();
        customerChoi.customerID = 10011;
        customerChoi.customerName = "최민기";
        customerChoi.bonusPoint = 20000;
        System.out.println(customerChoi.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10012, "김유신", 1101);
        customerKim.bonusPoint = 22000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
