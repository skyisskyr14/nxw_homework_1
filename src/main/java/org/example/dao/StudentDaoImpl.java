package org.example.dao;

import org.example.model.Student;

public class StudentDaoImpl implements StudentDao {

    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public void myPrintln(String str) {
        System.out.println("student:" + student);
    }
}
