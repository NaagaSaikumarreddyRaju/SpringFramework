package PropertyConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ApplicationConfigData applicationConfigData = context.getBean("applicationConfigData", ApplicationConfigData.class);
        //System.out.println(applicationConfigData.toString());

        Test T1 = context.getBean("test",Test.class);
        Test T2 = context.getBean("test",Test.class);
        Test T3 = context.getBean("test",Test.class);
        System.out.println(T1);
        System.out.println(T2);
        System.out.println(T3);
    }
}
