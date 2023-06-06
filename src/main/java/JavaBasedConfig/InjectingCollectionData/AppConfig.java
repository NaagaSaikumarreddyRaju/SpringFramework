package JavaBasedConfig.InjectingCollectionData;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Configuration
public class AppConfig {
    @Bean
    public CollectionData collectionData(){
        CollectionData collectionData = new CollectionData();
        collectionData.setNames(List.of("sai","kumar","reddy"));
        collectionData.setPinCode(Set.of(524001,524002,524003,524004));
        collectionData.setWordCount(Map.of("sai",1,"java",3,"python",2));
        return collectionData;
    }
}
