package JavaBasedConfig.InjectingObjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = context.getBean("employee",Employee.class);
        System.out.println(employee.getSal()+" "+employee.getId()+" "+employee.getName()+" "+employee.getExperience()+" "+employee.getAddress());

        Experience exp = employee.getExperience();
        System.out.println(exp.getMonths()+" "+ exp.getYears());
    }
}
