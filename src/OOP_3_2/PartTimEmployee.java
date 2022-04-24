package OOP_3_2;

public class PartTimEmployee extends Employee{
    private int workingHours;

    public PartTimEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary();
    }
}
