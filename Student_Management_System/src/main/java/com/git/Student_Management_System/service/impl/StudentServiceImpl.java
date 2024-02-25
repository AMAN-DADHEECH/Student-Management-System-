package com.git.Student_Management_System.service.impl;

import com.git.Student_Management_System.entity.StudentEntity;
import com.git.Student_Management_System.repository.StudentRepository;
import com.git.Student_Management_System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public StudentEntity getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public StudentEntity updateStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }


}