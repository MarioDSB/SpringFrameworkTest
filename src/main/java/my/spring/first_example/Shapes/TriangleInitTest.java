package my.spring.first_example.Shapes;

import my.spring.first_example.Shapes.Point;

import java.util.List;

public class TriangleInitTest {
    private final List<Point> points;

    public TriangleInitTest(List<Point> points) {
        this.points = points;
    }

    public void myInit() {
        System.out.println("\nCalling myInit method...");
    }

    public void myDestroy() {
        System.out.println("Calling myDestroy method...");
    }

    public void drawPointList() {
        System.out.println("(" + this.points.get(0) + ", " + this.points.get(1) + ", " + this.points.get(2) + ")");
    }
}
