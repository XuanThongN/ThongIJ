package OOP_1;

public class Circle {
    private double radius;
    public Circle(){};
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius;
    }
    public double getCircumference() {
        return radius * 3.14;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(6.5);
        System.out.println("Area: "+c1.getArea());
        System.out.println("Circumference: "+c1.getCircumference());
    }
}
