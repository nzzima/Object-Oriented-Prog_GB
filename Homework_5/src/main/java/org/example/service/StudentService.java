package org.example.service;

import org.example.model.Student;
import org.example.model.User;

import java.util.List;

public interface StudentService {
    Student create(User user);
    List<Student> read();
}
