package DesignPatterns.BuilderDesignPatttern;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudent) {
            return createEngineeringStudent();
        } else {
            return createMBAStudent();
        }
    }

    private Student createMBAStudent() {
        return new Student(studentBuilder.withRollNumber(1).withName("Raveena").withSubjects());
    }

    private Student createEngineeringStudent() {
        return new Student(studentBuilder.withRollNumber(1).withName("Shikha").withSubjects());
    }
}
