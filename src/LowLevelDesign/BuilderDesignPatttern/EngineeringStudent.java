package LowLevelDesign.BuilderDesignPatttern;

import java.util.Arrays;
import java.util.List;

public class EngineeringStudent extends StudentBuilder {
    @Override
    public StudentBuilder withSubjects() {
        List<String> subs = Arrays.asList("Maths", "CS", "OperatingSystem");
        this.subjects = subs;
        return this;
    }
}
