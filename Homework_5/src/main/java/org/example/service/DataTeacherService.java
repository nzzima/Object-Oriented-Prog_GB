package org.example.service;

import org.example.model.Teacher;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataTeacherService implements TeacherService{
    List<Teacher> teacherList = new ArrayList<>();

    @Override
    public Teacher create(User user) {
        Teacher teacher = (Teacher) user;
        teacher.setTeacherID(teacherList.size() + 1);
        teacherList.add(teacher);
        return teacher;
    }

    @Override
    public List<Teacher> read() {
        return teacherList;
    }
}
