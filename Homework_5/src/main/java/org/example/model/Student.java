package org.example.model;

public class Student extends User {
    private Integer studentID;
    private Double averageMark;

    public Student(String name, String surname, Integer age, Double averageMark) {
        super(name, surname, age);
        this.averageMark = averageMark;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageMark=" + averageMark +
                '}';
    }
}
