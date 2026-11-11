package polymorphsim.customer;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer() {
        super();
        initVIPCustomer();
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        this.agentID = agentID;
        initVIPCustomer();
    }

    private void initVIPCustomer(){
        saleRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price- (int) (price * saleRatio);
    }

    public String showCustomerInfo() {
        return super.showCustomerInfo() + "당담 상담원 아이디는 " + agentID;
    }
}
