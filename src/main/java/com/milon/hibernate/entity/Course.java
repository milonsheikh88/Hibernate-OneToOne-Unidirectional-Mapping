package com.milon.hibernate.entity;

import jakarta.persistence.*;

@Entity
public class Course {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "course_name")
	private String courseName;
	private String duration;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String courseName, String duration) {
		super();
		this.courseName = courseName;
		this.duration = duration;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [course=" + courseName + ", duration=" + duration + "]";
	}
	
	

}
