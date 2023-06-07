package com.springrest.springrest.services;

import com.springrest.springrest.respository.CourseRepository;
import com.springrest.springrest.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

   @Autowired
   CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> getCourseById(long courseId) {
        Optional<Course> course = courseRepository.findById(courseId);
        return course;
    }

    @Override
    public Course addCourse(Course course) {
        courseRepository.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseRepository.save(course);
        System.out.println("Course updated succesfully");
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        courseRepository.deleteById(parseLong);
    }

}
