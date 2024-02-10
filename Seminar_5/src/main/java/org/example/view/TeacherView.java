package org.example.view;

import org.example.model.Student;
import org.example.model.Teacher;

import java.util.List;

public class TeacherView {
    public void PrintTeacher(List<Teacher> teacherList) {

        System.out.println("Учителя: \n" + teacherList);
    }
}
