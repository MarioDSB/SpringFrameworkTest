package my.spring.first_example.Shapes;

import java.util.List;

public class Triangle implements Shape {
    String type = "unknown";
    int height;
    int length;

    Point pointA;
    Point pointB;
    Point pointC;

    List<Point> points;

    /*////////////////
    // Constructors //
    ////////////////*/

    public Triangle() {}

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle (String type, int height) {
        this.type = type;
        this.height = height;
    }

    public Triangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public Triangle(String type, int height, int length) {
        this.type = type;
        this.height = height;
        this.length = length;
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle(List<Point> points) {
        this.points = points;
    }

    /*/////////////////
    // Var functions //
    /////////////////*/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    /*///////////////////
    // Point functions //
    ///////////////////*/

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle...");
        System.out.println(getType() + " triangle drawn (" + getHeight() + " height; " + getLength() + " length) "
                        + pointsAsString());
    }

    public String pointsAsString() {
        return "(" + this.pointA + " " + this.pointB + " " + this.pointC + ")";
    }

    public void drawPoints() {
        System.out.println("Drawing triangle points...");
        System.out.println("(" + this.pointA + ", " + this.pointB + ", " + this.pointC + ")");
    }

    public void drawPointList() {
        System.out.println("Drawing triangle points...");
        System.out.println("(" + this.points.get(0) + ", " + this.points.get(1) + ", " + this.points.get(2) + ")");
    }
}
