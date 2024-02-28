package com.day7.classexcersice2.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day7.classexcersice2.model.Course;

public interface CourseRepo extends JpaRepository<Course,Integer>{

    List<Course> findAll();

    List<Course> findByCourseName(String courseName);

}
