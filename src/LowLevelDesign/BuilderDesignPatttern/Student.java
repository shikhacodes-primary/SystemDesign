package LowLevelDesign.BuilderDesignPatttern;

import java.util.List;

public class Student {
    int rollNumber;
    String name;
    int age;
    String fathersName;
    String mothersName;
    String address;
    List<String> subjects;

    public Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.name = builder.name;
        this.age = builder.age;
        this.fathersName = builder.fathersName;
        this.mothersName = builder.mothersName;
        this.address = builder.address;
        this.subjects = builder.subjects;
    }

    //Problem: multiple constructors for combinations of non-mandatory fields
//    public Student(int rollNumber, String name, String fathersName, String mothersName, String address, List<String> subjects) {
//        this.rollNumber = rollNumber;
//        this.name = name;
//        this.fathersName = fathersName;
//        this.mothersName = mothersName;
//        this.address = address;
//        this.subjects = subjects;
//    }
//
//    public Student(int rollNumber, String fathersName, String mothersName) {
//        this.rollNumber = rollNumber;
//        this.fathersName = fathersName;
//        this.mothersName = mothersName;
//    }
//
//    public Student(int rollNumber, String name, String fathersName, String mothersName) {
//        this.rollNumber = rollNumber;
//        this.name = name;
//        this.fathersName = fathersName;
//        this.mothersName = mothersName;
//    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", fathersName='" + fathersName + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", address='" + address + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
