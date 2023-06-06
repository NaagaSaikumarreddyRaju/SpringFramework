package JavaBasedConfig.ImportAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigDrinks.class);
    Drinks drinks = context.getBean("drinks",Drinks.class);
    Fruits fruits = context.getBean("fruits",Fruits.class);
    Vegetable vegetable = context.getBean("vegetable",Vegetable.class);
    
    //System.out.println(drinks);
    //System.out.println(fruits);
    //System.out.println(vegetable);

}
