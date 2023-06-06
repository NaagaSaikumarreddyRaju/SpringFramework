package JavaBasedConfig.JavaConfigInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Book book = context.getBean("book",Book.class);
        System.out.println(book.getId()+" "+book.getName()+" "+ book.getSal());

        User user = context.getBean("myuser",User.class);
        System.out.println(user.toString());

        Book book1 = context.getBean("book1",Book.class);
        System.out.println(book1.getId()+" "+book1.getName()+" "+ book1.getSal());
    }
}
