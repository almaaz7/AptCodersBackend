package com.almaaz.project.DTO;

import com.almaaz.project.model.CourseType;
import com.almaaz.project.model.LearnMode;

public class CourseDTO {
	
	private String name;
	private String subject;
	private String description;
	private int noOfClasses;
	private CourseType type;
	private LearnMode mode;
	private int chapters;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public int getChapters() {
		return chapters;
	}
	public void setChapters(int chapters) {
		this.chapters = chapters;
	}
	public CourseDTO(String name, String subject, String description, int noOfClasses, CourseType type, LearnMode mode,
			int chapters) {
		this.name = name;
		this.subject = subject;
		this.description = description;
		this.noOfClasses = noOfClasses;
		this.type = type;
		this.mode = mode;
		this.chapters = chapters;
	}
	
	
	
}
