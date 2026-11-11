package polymorphsim.customer;

public class GOLDCustomer extends Customer{
    double saleRatio;

    public GOLDCustomer() {
        super();
        initGOLDCustomer();
    }

    public GOLDCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        initGOLDCustomer();
    }

    private void initGOLDCustomer(){
        saleRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price- (int) (price * saleRatio);
    }
}
