package my.spring.first_example;

import my.spring.first_example.Shapes.Triangle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPostProcTest {
    private static final String TRIANGLE_POSTPROC_DEFPATH = "object_xmls/trianglePostProc.xml";

    public static void main(String[] args) {
        AbstractApplicationContext absContext = new ClassPathXmlApplicationContext(TRIANGLE_POSTPROC_DEFPATH);
        absContext.registerShutdownHook();
        Triangle tPointList = (Triangle) absContext.getBean("triangle_pointlist");

        tPointList.drawPointList();

        System.out.println();
    }
}
