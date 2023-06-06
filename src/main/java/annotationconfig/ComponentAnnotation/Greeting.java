package annotationconfig.ComponentAnnotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Greeting {
    public void greet(){
        System.out.println("good morning..");
    }
    @PostConstruct
    public void init(){
        System.out.println("Greeting :: init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Greeting :: destroy method");
    }
}
