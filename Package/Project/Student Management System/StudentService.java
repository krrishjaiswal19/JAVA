package com.student.service;

import com.student.model.Student;
import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> list = new ArrayList<>();

    public void addStudent(Student s) {
        list.add(s);
    }

    public void showStudents() {
        for (Student s : list) {
            System.out.println(s.getId() + " - " + s.getName());
        }
    }
}