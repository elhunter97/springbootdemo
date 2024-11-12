package com.javaweb.demo.repositories.impl;

import com.javaweb.demo.models.Student;
import com.javaweb.demo.repositories.IStudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


//danh dau day la 1 repository(1 bean)
@Repository
public class StudentRepository implements IStudentRepository {
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Han Bao Ngoc", "Ha Noi", 10));
        students.add(new Student(2, "Tran Khanh Linh", "Ha Noi", 9.4));
        students.add(new Student(3, "Han Bao Nam", "Ha Noi", 8));
        students.add(new Student(4, "Han Bao Anh", "Ha Noi", 7));
        students.add(new Student(5, "Han Bao Dang", "Ha Noi", 6.5));
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void save(Student student) {
        student.setId(students.get(students.size() - 1).getId() + 1);
        students.add(student);
    }
}
