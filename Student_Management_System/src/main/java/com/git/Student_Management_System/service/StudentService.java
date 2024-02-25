package com.git.Student_Management_System.service;

import com.git.Student_Management_System.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> getAllStudents();

    StudentEntity saveStudent(StudentEntity student);

    StudentEntity getStudentById(Long id);

    StudentEntity updateStudent(StudentEntity student);
    void deleteStudentById(Long id);
}
