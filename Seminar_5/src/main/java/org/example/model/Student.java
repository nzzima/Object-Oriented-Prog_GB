package org.example.model;

public class Student extends User{
    private Integer studentID;
    private Double average;

    public Student(String name, Integer age, Double average) {
        super(name, age);
        this.average = average;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", average=" + average +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
