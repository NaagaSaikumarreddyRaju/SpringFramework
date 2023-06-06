package annotationconfig.QualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
    @Autowired
    @Qualifier("minorStudent")
    StudentData studentData;

    public void info(){
        studentData.stuInfo();
    }
}
