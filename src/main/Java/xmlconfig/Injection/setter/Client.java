package xmlconfig.Injection.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");

        Employee emp = context.getBean("employee", Employee.class);
        System.out.println("EmpId: "+emp.getId());
        System.out.println("EmpName: "+emp.getName());
        System.out.println("EmpSal: "+emp.getSal());

        System.out.println("Employee Address Details");
        Address address = emp.getAddress();
        System.out.println("Door No..."+address.getDno());
        System.out.println("City Name..."+address.getCity());
        System.out.println("State Name..."+address.getState());
    }
}
