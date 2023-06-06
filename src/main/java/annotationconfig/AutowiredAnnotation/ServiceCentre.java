package annotationconfig.AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceCentre {
    @Autowired
    MobileService mobileService;
    @Autowired
    LaptopService laptopService;

    public void serviceInfo(){
        mobileService.mobileInfo();
        laptopService.laptopInfo();
    }
}
