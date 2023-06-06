package JavaBasedConfig;

import org.springframework.stereotype.Component;

@Component
public class Emp {
    public Emp() {
        System.out.println("Emp::Constructor");
    }
    public void empInfo(){
        System.out.println("All IT Employees Are Great");
    }
}
