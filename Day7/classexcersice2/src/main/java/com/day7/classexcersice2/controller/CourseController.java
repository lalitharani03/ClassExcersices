package com.day7.classexcersice2.controller;
import com.day7.classexcersice2.model.*;
import com.day7.classexcersice2.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    private final CourseService courseService;

   
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        Course createdCourse = courseService.createCourse(course);
        return new ResponseEntity<>(createdCourse, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @GetMapping("/{courseName}")
    public ResponseEntity<List<Course>> getCoursesByCourseName(@PathVariable String courseName) {
        List<Course> coursesByCourseName = courseService.getCoursesByCourseName(courseName);
        return new ResponseEntity<>(coursesByCourseName, HttpStatus.OK);
    }
}
