package org.example.model;

public class Teacher extends User {
    private Integer teacherID;
    private String subject;


    public Teacher(String name, String surname, Integer age, String subject) {
        super(name, surname, age);
        this.subject = subject;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                '}';
    }
}
