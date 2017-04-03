package com.rafael.Service;

import com.rafael.Repository.StudentRepository;
import com.rafael.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Collection<Student> getAllStudents(){
        return (Collection<Student>) this.studentRepository.findAll();
    }

    public Student getStudentById(int id){
        return this.studentRepository.findOne(id);
    }

    public void removeStudentById(int id) {
        this.studentRepository.delete(id);
    }

    public void updateStudent(Student student){
        this.studentRepository.save(student);
    }

    public void insertStudent(Student student) {
        this.studentRepository.save(student);
    }
}
