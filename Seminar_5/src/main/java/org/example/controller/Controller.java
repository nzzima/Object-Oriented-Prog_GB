package org.example.controller;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;
import org.example.service.DataStudentService;
import org.example.service.DataTeacherService;
import org.example.view.StudentView;
import org.example.view.TeacherView;

import java.util.List;

public class Controller {

    private DataStudentService dataStudentService;
    private DataTeacherService dataTeacherService;
    private StudentView studentView;
    private TeacherView teacherView;

    public void start() {
        User user1 = new Student("Юрий", 21, 4.5);
        User user2 = new Teacher("Петр", 40, "Математика");
        User user3 = new Student("Сергей", 22, 4.0);
        createStudent(user1);
        createTeacher(user2);
        createStudent(user3);
        List<Student> studentList = dataStudentService.read();
        List<Teacher> teacherList = dataTeacherService.read();
        studentView.PrintStudent(studentList);
        teacherView.PrintTeacher(teacherList);
    }

    public Student createStudent(User user) {
        return dataStudentService.create(user);
    }

    public Teacher createTeacher(User user) {
        return dataTeacherService.create(user);
    }

    public Controller() {
        dataStudentService = new DataStudentService();
        dataTeacherService = new DataTeacherService();
        studentView = new StudentView();
        teacherView = new TeacherView();
    }
}
