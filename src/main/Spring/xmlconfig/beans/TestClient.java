package xmlconfig.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-config.xml");

        //Emp e = (Emp) applicationContext.getBean("emp"); Not recommended
        //Emp e = (Emp) applicationContext.getBean("stu"); this will result in ClassCastException(employee refers to student bean)
        //Above exception is core java exception, we are using spring
        //Emp e = applicationContext.getBean("emp", Student.class); Now it will throw spring exception and this is recommended

        Emp e = applicationContext.getBean("emp", Emp.class); //we can use this instead of typecasting and recommended approach
        e.info();
    }
}
