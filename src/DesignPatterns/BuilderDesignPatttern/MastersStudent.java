package DesignPatterns.BuilderDesignPatttern;

import java.util.Arrays;
import java.util.List;

public class MastersStudent extends StudentBuilder {
    @Override
    public StudentBuilder withSubjects() {
        List<String> masterSubjects = Arrays.asList("Sub1", "Sub2");
        this.subjects = masterSubjects;
        return this;
    }
}
