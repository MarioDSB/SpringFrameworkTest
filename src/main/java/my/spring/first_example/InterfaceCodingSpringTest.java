package my.spring.first_example;

import my.spring.first_example.Shapes.Shape;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InterfaceCodingSpringTest {
    private static final String CIRCLE_XML_DEFINITION_PATH = "object_xmls/circle.xml";
    private static final String TRIANGLE_XML_DEFINITION_PATH = "object_xmls/triangle.xml";

    public static void main(String[] args) {
        AbstractApplicationContext circlesAbsContext = new ClassPathXmlApplicationContext(CIRCLE_XML_DEFINITION_PATH);
        circlesAbsContext.registerShutdownHook();
        Shape simpleCircle = (Shape) circlesAbsContext.getBean("simpleCircle");
        simpleCircle.draw();

        System.out.println();

        AbstractApplicationContext tAbsContext = new ClassPathXmlApplicationContext(TRIANGLE_XML_DEFINITION_PATH);
        Shape simpleTriangle = (Shape) tAbsContext.getBean("triangle_inheritance");
        simpleTriangle.draw();
    }
}
