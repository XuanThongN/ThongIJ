package OOP_2;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +super.toString()+
                "bonus=" + bonus +
                '}';
    }
    public void display() {
        toString();
    }
}
