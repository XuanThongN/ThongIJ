package OOP_3_1;

public class Customer extends Person  {
    private int balance;

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "balance=" + balance +
                '}';
    }
    public void display() {
        toString();
    }
}
