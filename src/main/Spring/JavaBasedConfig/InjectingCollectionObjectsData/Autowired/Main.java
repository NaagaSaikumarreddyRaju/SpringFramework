package JavaBasedConfig.InjectingCollectionObjectsData.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CollectionData data= context.getBean("collectionData", CollectionData.class);
        data.display();
    }
}
