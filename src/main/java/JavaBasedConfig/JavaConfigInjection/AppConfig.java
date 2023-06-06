package JavaBasedConfig.JavaConfigInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Book book(){
        Book book = new Book();
        book.setId(123);
        book.setName("SAI");
        book.setSal(1000.23);
        return book;
    }

    @Bean
    public Book book1(){
        Book book = new Book();
        book.setId(123);
        book.setName("REDDY");
        book.setSal(1000.23);
        return book;
    }
    @Bean("myuser")
    public User user(){
       User user = new User("saikumar","reddy","sai@gmail.com",123456789L);
       return user;
    }
}
