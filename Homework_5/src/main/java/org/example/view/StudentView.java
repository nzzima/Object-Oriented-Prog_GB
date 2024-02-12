package org.example.view;

import org.example.model.Student;

import java.util.List;

public class StudentView {
    public void PrintStudent(List<Student> studentList) {
        System.out.println("Студенты: ");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
