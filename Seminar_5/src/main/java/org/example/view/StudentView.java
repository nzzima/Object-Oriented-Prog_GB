package org.example.view;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;

import java.util.List;

public class StudentView {
    public void PrintStudent(List<Student> studentList) {
        System.out.println("Студенты: \n" + studentList);
    }
}
