package com.rafael.Repository;

import com.rafael.Entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer>{

    List<Student> findByCourse(String Course);
}
