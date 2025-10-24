package DesignPatterns.BuilderDesignPatttern;

public class Client {
    public static void main(String[] args) {
        Director enggDirector = new Director(new EngineeringStudent());
        Director mbaDirector = new Director(new MastersStudent());

        Student enggStudent = enggDirector.createStudent();
        Student mbaStudent = mbaDirector.createStudent();

        System.out.println(enggStudent);
        System.out.println(mbaStudent);
    }
}
