package annotationconfig.QualifierAnnotation;

import org.springframework.stereotype.Component;

@Component
public class MajorStudent implements StudentData{

    @Override
    public void stuInfo() {
        System.out.println("Major Student Bro");
    }
}
