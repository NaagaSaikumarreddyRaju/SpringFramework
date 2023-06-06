package JavaBasedConfig.InjectingCollectionObjectsData;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CollectionData data= context.getBean("collectionData", CollectionData.class);
        System.out.println(data.toString());
    }
}
