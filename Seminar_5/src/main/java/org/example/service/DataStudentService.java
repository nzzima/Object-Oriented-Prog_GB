package org.example.service;

import org.example.model.Student;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataStudentService implements StudentService {
    List<Student> studentList = new ArrayList<>();

    @Override
    public Student create(User user) {
        Student student = (Student) user;
        student.setStudentID(studentList.size() + 1);
        studentList.add(student);
        return student;
    }

    @Override
    public List<Student> read() {
        return studentList;
    }
}
