package JavaBasedConfig.ImportAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigVegetable {
    @Bean
    public Vegetable vegetable(){
        return new Vegetable();
    }
}
