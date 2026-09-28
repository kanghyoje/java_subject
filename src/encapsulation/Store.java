package encapsulation;

public class Store {
    private Phone phone;

    Store(Phone phone) {
        this.phone = phone;
    }

    public Phone sellPhone(String model, double budget) {

        if (model.equals(phone.getModel()) && budget >= phone.getPrice()) {
            return phone;
        } else {
            return null;
        }
    }
}
