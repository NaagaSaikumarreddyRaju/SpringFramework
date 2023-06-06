package xmlconfig.Injection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");

        Book book = context.getBean("book",Book.class);
        System.out.println(book);
    }
}
