package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
//        출

        VIPCustomer customerChoi = new VIPCustomer();
        customerChoi.customerID = 10011;
        customerChoi.customerName = "최민기";
        customerChoi.bonusPoint = 20000;
        System.out.println(customerChoi.showCustomerInfo());
    }
}
