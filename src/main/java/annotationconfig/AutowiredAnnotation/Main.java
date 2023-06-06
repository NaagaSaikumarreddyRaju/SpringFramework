package annotationconfig.AutowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-annotation.xml");

        ServiceCentre serviceCentre = context.getBean("serviceCentre", ServiceCentre.class);
        serviceCentre.serviceInfo();
    }
}
