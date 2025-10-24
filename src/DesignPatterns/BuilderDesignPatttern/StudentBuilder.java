package DesignPatterns.BuilderDesignPatttern;

import java.util.List;

public abstract class StudentBuilder {
    int rollNumber;
    String name;
    int age;
    String fathersName;
    String mothersName;
    String address;
    List<String> subjects;

    public StudentBuilder withRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder withFathersName(String fathersName) {
        this.fathersName = fathersName;
        return this;
    }

    public StudentBuilder withMothersName(String mothersName) {
        this.mothersName = mothersName;
        return this;
    }

    public StudentBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    abstract public StudentBuilder withSubjects();

    public Student build() {
        return new Student(this);
    }



}
