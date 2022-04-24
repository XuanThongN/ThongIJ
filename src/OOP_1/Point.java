package OOP_1;

public class Point {
    private double x,y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        setX(x);
        setY(y);
    }
    public double distance(double x,double y){
        return Math.sqrt(Math.pow(x-getX(),2)+Math.pow(y-getY(),2));
    }
    public double distance(Point point2) {
        return Math.sqrt(Math.pow(point2.getX()-getX(),2)+Math.pow(point2.getY()-getY(),2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setXY(10,10);
        System.out.println(point1.toString());
        Point point2 = new Point();
        point2.setXY(6,6);
        System.out.println(point1.distance(3,3));
        System.out.println(point1.distance(point2));
    }
}
