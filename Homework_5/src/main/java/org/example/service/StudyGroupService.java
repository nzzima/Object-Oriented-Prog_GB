package org.example.service;

import org.example.model.Student;
import org.example.model.StudyGroup;
import org.example.model.Teacher;

import java.util.List;
import java.util.Map;

public interface StudyGroupService {
    StudyGroup create(Teacher teacher, List<Student> studentList);
    Map<Teacher, List<Student>> read();
}
