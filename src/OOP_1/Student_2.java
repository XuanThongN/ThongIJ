package OOP_1;

public class Student_2 {
    private int id, age, score;
    private String name, address;

    public Student_2() {
    }

    ;

    public Student_2(int id, String name, int age, String address, int score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student_2{" +
                "id=" + id +
                ", age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student_2 st2 = new Student_2(01, "Thong", 21, "QuangBinh", 7);
        System.out.println(st2.toString());
        st2.setId(02);
        System.out.println("Id: " + st2.getId());
        st2.setName("NXT");
        System.out.println("Name: " + st2.getName());
        st2.setAge(18);
        System.out.println("Age: " + st2.getAge());
        st2.setAddress("Hue");
        System.out.println("Address: " + st2.getAddress());
        st2.setScore(9);
        System.out.println("Address: " + st2.getScore());
    }
}
