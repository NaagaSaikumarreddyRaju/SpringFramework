package JavaBasedConfig.InjectingCollectionObjectsData.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
@Component
public class CollectionData {
    @Autowired
    private List<String> names;
    @Autowired
    private Set<Integer> pincodes;
    @Autowired
    Map<String,Integer> wordCount;

//    public CollectionData() {
//    }
    public void display(){
       names.forEach(name -> System.out.println(name));
       pincodes.forEach(code -> System.out.println(code));
       wordCount.forEach((k,v) -> System.out.println(k+"----"+v));
   }
}
