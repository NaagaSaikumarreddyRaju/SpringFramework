package JavaBasedConfig.InjectingCollectionObjectsData;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Set;

@Configuration
public class AppConfig {

    @Bean
    public Book book1(){
        return new Book(1,"sai","reddy");
    }
    @Bean
    public Book book2(){
        return new Book(1,"core","java");
    }

    @Bean
    public Customer customer1(){
        return new Customer("chilaka","pandu","chilaka@molka.com");
    }

    @Bean
    public Customer customer2(){
        return new Customer("raju","reddy","sai@sai.com");
    }
    @Bean
    public CollectionData collectionData(){
        CollectionData collectionData = new CollectionData(List.of(book1(),book2()),Set.of(customer1(),customer2()));
        return collectionData;
    }
}
