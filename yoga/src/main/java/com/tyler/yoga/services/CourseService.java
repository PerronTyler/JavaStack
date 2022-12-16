package com.tyler.yoga.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tyler.yoga.models.Course;
import com.tyler.yoga.models.User;
import com.tyler.yoga.repositories.CourseRepository;
@Service
public class CourseService {

	private final CourseRepository courseRepo;
	public CourseService(CourseRepository courseRepo) {
		this.courseRepo = courseRepo;
	}
	
	public List<Course> getAll(){
		return courseRepo.findAll();
	}
	public Course create(Course course) {
		return courseRepo.save(course);
	}
	public Course getCourse(Long id) {
		Optional<Course> potentialCourse = courseRepo.findById(id);
		return potentialCourse.isPresent() ? potentialCourse.get() : null;
	}
	public Course update(String courseName, User instructor, String weekday, String description, String teacher, int price) {
		Course courseToBeUpdated = new Course(courseName,instructor, weekday, description, teacher, price);
		return courseRepo.save(courseToBeUpdated);
	}
	public Course update(Course course) {
		return courseRepo.save(course);
	}
	public String deleteById(Long id) {
		courseRepo.deleteById(id);
		return "You have deleted the record with the id of: " + id;
	}

}
