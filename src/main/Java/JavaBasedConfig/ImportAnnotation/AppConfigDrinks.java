package JavaBasedConfig.ImportAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfigFruits.class, AppConfigVegetable.class})
public class AppConfigDrinks {
    @Bean
    public Drinks drinks(){
        return new Drinks();
    }
}
