package org.example.controller;

import org.example.model.Student;
import org.example.model.StudyGroup;
import org.example.model.Teacher;
import org.example.model.User;
import org.example.service.DataStudentService;
import org.example.service.DataStudyGroupService;
import org.example.service.DataTeacherService;
import org.example.view.StudentView;
import org.example.view.StudyGroupView;
import org.example.view.TeacherView;

import java.util.List;
import java.util.Map;

public class Controller {
    private DataStudentService dataStudentService;
    private DataTeacherService dataTeacherService;
    private DataStudyGroupService dataStudyGroupService;
    private StudentView studentView;
    private TeacherView teacherView;
    private StudyGroupView studyGroupView;

    public void start() {
        User user1 = new Student("Николай", "Остапов", 20, 4.3);
        User user2 = new Student("Сергей", "Волкодав", 23, 4.6);
        User user3 = new Student("Елизавета", "Круглова", 21, 4.9);
        User user4 = new Student("Екатерина", "Соколова", 21, 5.0);
        User user5 = new Student("Петр", "Румянин", 22, 3.8);

        User user12 = new Teacher("Вячеслав", "Садовников", 43, "Математика");
        createStudent(user1);
        createStudent(user2);
        createStudent(user3);
        createStudent(user4);
        createStudent(user5);

        Teacher teacher = createTeacher(user12);

        List<Student> studentList = dataStudentService.read();
        List<Teacher> teacherList = dataTeacherService.read();

        StudyGroup StudyGroup = new StudyGroup(teacher, studentList);
        createStudyGroup(StudyGroup);
        Map<Teacher, List<Student>> teacherStudentsMap = dataStudyGroupService.read();

        //studentView.PrintStudent(studentList);
        //teacherView.PrintTeacher(teacherList);
        studyGroupView.PrintStudyGroup(teacherStudentsMap);
    }

    public Student createStudent(User user) {
        return dataStudentService.create(user);
    }

    public Teacher createTeacher(User user) {
        return dataTeacherService.create(user);
    }

    public StudyGroup createStudyGroup(StudyGroup studyGroup) {
        return dataStudyGroupService.create(studyGroup.getTeacher(), studyGroup.getStudentList());
    }

    public Controller() {
        dataStudentService = new DataStudentService();
        dataTeacherService = new DataTeacherService();
        dataStudyGroupService = new DataStudyGroupService();
        studentView = new StudentView();
        teacherView = new TeacherView();
        studyGroupView = new StudyGroupView();
    }
}
