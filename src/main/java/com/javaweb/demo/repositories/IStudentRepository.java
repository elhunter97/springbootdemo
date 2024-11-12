package com.javaweb.demo.repositories;

import com.javaweb.demo.models.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();

    void save(Student student);
}
