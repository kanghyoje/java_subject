package polymorphsim.customer;

import java.util.ArrayList;

public class CustomerTest2 {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(10010,"홍길동"));
        customerList.add(new Customer(10020,"김철수"));
        customerList.add(new GOLDCustomer(10030, "강감찬"));
        customerList.add(new GOLDCustomer(10040, "강세종"));
        customerList.add(new VIPCustomer(10050,"이순신", 1203));

        System.out.println("===고객 정보 출력===");
        for (Customer cs: customerList) {
            System.out.println(cs.showCustomerInfo());
        }

        System.out.println("===할인율과 포인트 계산===");
        int price = 40000;
        for (Customer cs: customerList) {
            int cost = cs.calcPrice(price);
            System.out.println(cs.customerName + "님이 " + cost + "원 지불하셨습니다.");
            System.out.println("현재 보너스 포인트는 " + cs.bonusPoint + "입니다.");
        }
    }
}
