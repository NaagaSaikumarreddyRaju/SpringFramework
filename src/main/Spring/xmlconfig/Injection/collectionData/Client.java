package xmlconfig.Injection.collectionData;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");

        CollectionData data = context.getBean("collection", CollectionData.class);

//        List<String> names = data.getNames();
//        System.out.println(names.getClass().getName()); // default is java.util.ArrayList
//
//        Set<Integer> pinCode = data.getPinCode();
//        System.out.println(pinCode.getClass().getName()); // default is java.util.LinkedHashSet
//
//        Map<String,Integer> wordCount = data.getWordCount();
//        System.out.println(wordCount.getClass().getName()); // default is java.util.LinkedHashMap

        data.getNames().forEach(name -> System.out.println(name));
        data.getPinCode().forEach(pin -> System.out.println(pin));
        data.getWordCount().forEach((k,v)-> System.out.println(k+" word count is "+v));
        data.getProperties().forEach((k,v) -> System.out.println(k+" "+v));
        data.getBookData().forEach(book -> System.out.println(book.getId()+" "+book.getName()+" "+book.getAuthor()));
    }
}
