package com.javaweb.demo.services.impl;

import com.javaweb.demo.models.Student;
import com.javaweb.demo.repositories.IStudentRepository;
import com.javaweb.demo.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//danh dau day la 1 service(1 bean)
@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }
}
