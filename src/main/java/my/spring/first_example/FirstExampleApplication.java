package my.spring.first_example;

import my.spring.first_example.Shapes.Triangle;
import my.spring.first_example.Shapes.TriangleInitTest;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FirstExampleApplication {
    private static final String TRIANGLE_XML_DEFINITION_PATH = "object_xmls/triangle.xml";

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(TRIANGLE_XML_DEFINITION_PATH);

        {
            Triangle tSetter = (Triangle) context.getBean("triangle_setter");
            System.out.print("Triangle A: ");
            tSetter.draw();
        }

        {
            Triangle tConstructor = (Triangle) context.getBean("triangle_constructor");
            System.out.print("Triangle B: ");
            tConstructor.draw();
        }

        {
            Triangle tConstNoType = (Triangle) context.getBean("triangle_constructor_no_type");
            System.out.print("Triangle C: ");
            tConstNoType.draw();
        }

        {
            Triangle tPoints = (Triangle) context.getBean("triangle_points");
            System.out.print("Triangle D: ");
            tPoints.drawPoints();
        }

        {
            Triangle tPointList = (Triangle) context.getBean("triangle_pointlist");
            System.out.print("Triangle E: ");
            tPointList.drawPointList();
        }

        {
            Triangle tInherited = (Triangle) context.getBean("triangle_inheritance");
            System.out.print("Triangle F: ");
            tInherited.draw();
        }

        {
            Triangle tListInherited = (Triangle) context.getBean("triangle_list_inheritance");
            System.out.print("Triangle G: ");
            tListInherited.drawPointList();
        }

        {
            System.out.println();
            AbstractApplicationContext absContext = new ClassPathXmlApplicationContext(TRIANGLE_XML_DEFINITION_PATH);
            absContext.registerShutdownHook();
            absContext.getBean("triangle_abstractcontext");
        }

        {
            TriangleInitTest tmyInit = (TriangleInitTest) context.getBean("triangle_myinit");
            System.out.print("Triangle H: ");
            tmyInit.drawPointList();
        }

        System.out.println();
        // SpringApplication.run(FirstExampleApplication.class, args);
    }
}
