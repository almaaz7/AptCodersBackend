package com.almaaz.project.contorller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.almaaz.project.DTO.CourseDTO;
import com.almaaz.project.model.Course;
import com.almaaz.project.model.UserRole;
import com.almaaz.project.repository.CourseRepository;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping("entry")
	public String entry() {
		return "entry";
	}

	@PostMapping("/create")
	public ResponseEntity<String> createCourse(@RequestBody CourseDTO courseDTO){
		Course c = new Course();
		c.setName(courseDTO.getName());
		c.setChapters(courseDTO.getChapters());
		c.setDescription(courseDTO.getDescription());
		c.setMode(courseDTO.getMode());
		c.setType(courseDTO.getType());
		c.setNoOfClasses(courseDTO.getNoOfClasses());
		c.setSubject(courseDTO.getSubject());
		courseRepository.save(c);
		return new ResponseEntity<>("success",HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateCourse(@RequestBody CourseDTO courseDTO,@RequestParam int id){
		Course existingCourse = courseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Course not found with id: " + id));
		
		if(courseDTO.getName() != null) {
			existingCourse.setName(courseDTO.getName());
		}
		if(courseDTO.getMode().equals(null)) {
			existingCourse.setMode(courseDTO.getMode());
		}
		if(courseDTO.getType() != null) {
			existingCourse.setType(courseDTO.getType());
		}
		if(courseDTO.getSubject()!= null) {
			existingCourse.setSubject(courseDTO.getSubject());
		}
		if(courseDTO.getDescription() != null) {
			existingCourse.setDescription(courseDTO.getDescription());
		}
		if(courseDTO.getChapters() != 0) {
			existingCourse.setChapters(courseDTO.getChapters());
		}
		if(courseDTO.getNoOfClasses() != 0) {
			existingCourse.setNoOfClasses(courseDTO.getNoOfClasses());
		}
		
		courseRepository.save(existingCourse);
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<String> getCourse(@RequestParam UserRole userRole){
		if(userRole == UserRole.STUDENT) {
			return new ResponseEntity<String>("student",HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Course Creator", HttpStatus.OK);
		}
	}
}
