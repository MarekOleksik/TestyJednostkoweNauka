package testing;

public class Account {
    private boolean active;
    private Address defaultDeliveryAddress;



    public Account(){
        this.active = false;
    }
    public void activate(){
        this.active = true;
    }
    public boolean isActive(){
        return this.active;
    }

    public void setDefaultDeliveryAddress(Address defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }

    public Address getDefaultDeliveryAddress() {
        return defaultDeliveryAddress;
    }
}
