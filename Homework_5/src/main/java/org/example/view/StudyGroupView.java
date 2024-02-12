package org.example.view;

import org.example.model.Student;
import org.example.model.Teacher;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class StudyGroupView {
    public void PrintStudyGroup(Map<Teacher, List<Student>> teacherStudentMap) {
        for (Teacher teacher : teacherStudentMap.keySet()) {
            String teacherString = teacher.toString();
            List<Student> studentList = teacherStudentMap.get(teacher);
            System.out.println("\nУчебная группа:\n" + teacherString);
            System.out.println("Студенты группы: ");
            for (Student student : studentList) {
                System.out.println(student.toString());
            }
        }
    }
}
