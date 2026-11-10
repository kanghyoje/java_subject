package inheritance;

public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomer () {
        super();
        saleRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
        System.out.println("하위 클래스 VIPCustomer() 생성자 호출");
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        this.agentID = agentID;
        saleRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
        System.out.println("하위 클래스 VIPCustomer(int, String, int) 생성자 호출");
    }

    public String showCustomerInfo() {
        return super.showCustomerInfo() + "당담 상담원 아이디는 " + agentID;
    }
}
