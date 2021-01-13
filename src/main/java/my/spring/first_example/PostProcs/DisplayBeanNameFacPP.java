package my.spring.first_example.PostProcs;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DisplayBeanNameFacPP implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configBeanFactory)
            throws BeansException {
        System.out.println("Bean Factory PostProc is executed");
    }
}
