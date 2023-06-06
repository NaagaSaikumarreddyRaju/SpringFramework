package xmlconfig.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");

//        Emp e = context.getBean("emp",Emp.class);
//        e.empInfo();

//        Employee constructor
//        Employee :: init() method
//        Employees are good
//        But we didn't get destroy method value for that instead of using ApplicationContext use ConfigurableContext and write context.close()
    }
}
