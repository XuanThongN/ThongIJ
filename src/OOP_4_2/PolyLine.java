package OOP_4_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PolyLine {
    private List<Point> points = new ArrayList<>();

    public PolyLine() {
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }
    public void appendPoint(Point point) {
        points.add(point);
    }
    public void appendPoint(int x, int y) {
        Point point = new Point(x,y);
        points.add(point);
    }
    public double getLength() {
        double length = 0;
        for (int i = points.size() - 1; i >=0 ; i--) {
            if (i-1<0) break;
            Point p1 = points.get(i);
            Point p2 = points.get(i-1);
            length += Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
        }
        return length;
    }
    public void sapXepDiem() {
        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.getX()>p2.getX()) return 1;
                else if (p1.getX()<p2.getX()) return -1;
                return 0;
            }
        });
    }

    public static void main(String[] args) {
        PolyLine pl = new PolyLine();
        Point px = new Point(1,1);
        pl.appendPoint(3,0);
        pl.appendPoint(2,3);
        pl.appendPoint(4,2);
        pl.appendPoint(px);
        pl.sapXepDiem();
        System.out.println(pl.points);
        System.out.printf("Độ dài của PolyLine: %.15f",pl.getLength());

    }
}
