package com.egesua.librarybackend.service;

import com.egesua.librarybackend.entity.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent (Student student);
    public List<Student> getAllStudents();
}
