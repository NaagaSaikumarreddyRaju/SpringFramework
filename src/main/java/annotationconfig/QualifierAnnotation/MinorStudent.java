package annotationconfig.QualifierAnnotation;

import org.springframework.stereotype.Component;

@Component
public class MinorStudent implements StudentData{
    @Override
    public void stuInfo() {
        System.out.println("Minor Student.Kottaru teesukunnam ma time vasthundhi memu kodutham");
    }
}
