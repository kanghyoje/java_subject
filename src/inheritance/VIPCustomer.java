package inheritance;

public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomer () {
        saleRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
        System.out.println("하위 클래스 VIPCustomer() 생성자 호출");
    }
}
