package co.com.poli.cursos.services;

import co.com.poli.cursos.persistence.entity.Course;

import java.util.List;

public interface CourseService {
    Course save(Course course);
    List<Course> findAll();
}
