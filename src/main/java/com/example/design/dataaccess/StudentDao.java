package com.example.design.dataaccess;

import java.util.List;

/**
 * @author Arte
 * @create 21-1-13
 */
public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(int rollNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
