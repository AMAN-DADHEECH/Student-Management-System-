package com.git.Student_Management_System.repository;

import com.git.Student_Management_System.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
