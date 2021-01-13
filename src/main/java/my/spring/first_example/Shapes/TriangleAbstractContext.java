package my.spring.first_example.Shapes;

import my.spring.first_example.Shapes.Point;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class TriangleAbstractContext implements InitializingBean, DisposableBean {
    private final List<Point> points;

    public TriangleAbstractContext(List<Point> points) {
        this.points = points;
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("TriangleAbstractContext points:");
        System.out.println("(" + this.points.get(0) + ", " + this.points.get(1) + ", " + this.points.get(2) + ")");
    }

    @Override
    public void destroy() {
        System.out.println("TriangleAbstractContext was destroyed...");
    }
}
