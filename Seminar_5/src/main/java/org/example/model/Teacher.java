package org.example.model;

public class Teacher extends User{
    private Integer teacherID;
    private String curs;

    public Teacher(String name, Integer age, String curs) {
        super(name, age);
        this.curs = curs;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", curs='" + curs + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
