package com.almaaz.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almaaz.project.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
