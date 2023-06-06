package JavaBasedConfig.InjectingCollectionObjectsData.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Configuration
@ComponentScan("JavaBasedConfig.InjectingCollectionObjectsData.Autowired")
public class AppConfig {
    @Bean
    public List<String> names(){
        return List.of("sai","anu","sravs","chandu");
    }
    @Bean
    public Set<Integer> pinCodes(){
        return Set.of(524001,524002,524003);
    }
    @Bean
    public Map<String,Integer> wordCount(){
        return Map.of("sai",1,"hari",3,"varun",0);
    }
//    @Bean
//    public CollectionData collectionData(){
//        return new CollectionData();
//    }
    // we can remove above code and use @Component and @ComponentScan to fetch the Bean.
}
