package inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        Customer cs = new VIPCustomer(10030, "나몰라", 1102);
//        VIPCustomer cs2 = new Customer(); 불가능
        cs.bonusPoint = 1000;

        System.out.println(cs.customerName + "님이 지불해야 할 금액은 " + cs.calcPrice(10000) + "원입니다.ㅇ");
    }
}
