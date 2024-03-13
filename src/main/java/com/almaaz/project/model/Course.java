package com.almaaz.project.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String subject;
	private int chapters;
	private int noOfClasses;
	
	@Enumerated(EnumType.STRING)
	private CourseType type;
	
	@Enumerated(EnumType.STRING)
	private LearnMode mode;
	
//	private LocalDate startDate;
//	private LocalDate endDate;
//	
//	private boolean active;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getChapters() {
		return chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}

	public int getNoOfClasses() {
		return noOfClasses;
	}

	public void setNoOfClasses(int noOfClasses) {
		this.noOfClasses = noOfClasses;
	}

	public CourseType getType() {
		return type;
	}

	public void setType(CourseType type) {
		this.type = type;
	}

	public LearnMode getMode() {
		return mode;
	}

	public void setMode(LearnMode mode) {
		this.mode = mode;
	}
	
	public Course() {
		
	}

	public Course(String name, String description, String subject, int chapters, int noOfClasses, CourseType type,
			LearnMode mode) {
		this.name = name;
		this.description = description;
		this.subject = subject;
		this.chapters = chapters;
		this.noOfClasses = noOfClasses;
		this.type = type;
		this.mode = mode;
	}
	
	

//	public LocalDate getStartDate() {
//		return startDate;
//	}
//
//	public void setStartDate(LocalDate startDate) {
//		this.startDate = startDate;
//	}
//
//	public LocalDate getEndDate() {
//		return endDate;
//	}
//
//	public void setEndDate(LocalDate endDate) {
//		this.endDate = endDate;
//	}
//
//	public boolean isActive() {
//		return active;
//	}
//
//	public void setActive(boolean active) {
//		this.active = active;
//	}
	
	
}
