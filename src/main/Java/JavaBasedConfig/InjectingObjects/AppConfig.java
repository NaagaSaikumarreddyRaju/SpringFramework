package JavaBasedConfig.InjectingObjects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Employee employee(){
        Employee employee = new Employee();
        employee.setId(123);
        employee.setName("SAIKUMAR");
        employee.setSal(12345.10);
        employee.setAddress(address());
        employee.setExperience(experience());
        return employee;
    }

    @Bean
    public Address address(){
       Address address = new Address("HYD","TS");
       return address;
    }

    @Bean
    public Experience experience(){
        Experience experience = new Experience();
        experience.setMonths(10);
        experience.setYears(2);
        return experience;
    }
}
