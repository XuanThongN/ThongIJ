package OOP_1;

public class Account {
    private int id;
    private String name;
    private int balance=0;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance+=amount;
    }
    public void withdraw(int amount) {
        if(balance<amount) {
            System.out.println("That amount exceeds your current balance.");
        }else balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void display() {
        System.out.println(toString());
    }

    public static void main(String[] args) {
        Account ac1 = new Account(01,"Thông");
        Account ac2 = new Account(02,"NXT",20);
        ac1.deposit(23);
        ac2.withdraw(20);
        ac1.display();
        ac2.display();
    }
}
