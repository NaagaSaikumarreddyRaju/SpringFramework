package JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("JavaBasedConfig")
public class JavaConfig {
//    @Bean(name="emp", initMethod="init",destroyMethod="destroy")
//    public Emp emp(){
//        return new Emp();
//    }
}
