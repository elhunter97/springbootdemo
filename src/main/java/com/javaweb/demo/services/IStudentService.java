package com.javaweb.demo.services;

import com.javaweb.demo.models.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void save(Student student);
}
