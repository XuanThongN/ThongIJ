package OOP_1;

public class Student {
    private String name, gender;
    private int age;
    private double gpa;

    public Student() {};
    public Student(String name, int age, String gender, double gpa) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;

    }

    public void display() {
        System.out.printf("Name: %s, age: %d, gender: %s, gpa: %.1f%n",name,age,gender,gpa);
    }

    public static void main(String[] args) {
        Student st = new Student("Thông",21,"nam",5);
        st.display();
    }
}
