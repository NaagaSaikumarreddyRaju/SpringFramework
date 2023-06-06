package xmlconfig.beanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFunction {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
        MainNamesData names = context.getBean("mainNamesData",MainNamesData.class);
        names.namesInfo();
//       String[] indianNames = names.getNames();
//       for(String name: indianNames){
//           System.out.println(name);
//       }
    }
}
