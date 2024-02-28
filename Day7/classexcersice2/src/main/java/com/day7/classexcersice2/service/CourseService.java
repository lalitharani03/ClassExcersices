package com.day7.classexcersice2.service;
import com.day7.classexcersice2.model.*;
import org.springframework.stereotype.Service;
import com.day7.classexcersice2.repository.*;
import java.util.List;

@Service
public class CourseService {

    private final CourseRepo courseRepo;

    public CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    public Course createCourse(Course course) {
        return courseRepo.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public List<Course> getCoursesByCourseName(String courseName) {
        return courseRepo.findByCourseName(courseName);
    }
}
