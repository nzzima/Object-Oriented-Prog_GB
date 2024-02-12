package org.example.service;

import org.example.model.Student;
import org.example.model.StudyGroup;
import org.example.model.Teacher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStudyGroupService implements StudyGroupService{
    Map<Teacher, List<Student>> teacherStudentMap = new HashMap<>();

    @Override
    public StudyGroup create(Teacher teacher, List<Student> studentList) {
        StudyGroup studyGroup = new StudyGroup(teacher, studentList);
        teacherStudentMap.put(teacher, studentList);
        return studyGroup;
    }

    @Override
    public Map<Teacher, List<Student>> read() {
        return teacherStudentMap;
    }
}
