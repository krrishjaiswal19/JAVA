package com.student.main;

import com.student.service.StudentService;
import com.student.model.Student;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        service.addStudent(new Student(1, "Rahul"));
        service.addStudent(new Student(2, "Aman"));

        service.showStudents();
    }
}