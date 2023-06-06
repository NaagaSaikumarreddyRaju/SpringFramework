package JavaBasedConfig.InjectingCollectionData;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CollectionData data = context.getBean("collectionData",CollectionData.class);

        data.getNames().forEach(names-> System.out.println(names));
        data.getPinCode().forEach(code -> System.out.println(code));
        data.getWordCount().forEach((k,v)-> System.out.println(k+" "+v));
    }
}
