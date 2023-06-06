package JavaBasedConfig.ImportAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigFruits {
    @Bean
    public Fruits fruits(){
        return new Fruits();
    }
}
