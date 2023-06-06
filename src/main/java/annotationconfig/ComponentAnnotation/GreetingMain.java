package annotationconfig.ComponentAnnotation;

import annotationconfig.ComponentAnnotation.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-annotation.xml");

        Greeting greeting = context.getBean("greeting", Greeting.class);
        greeting.greet();
    }
}

