package com.mybatiscourse.dao;

import com.mybatiscourse.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudents();
}
