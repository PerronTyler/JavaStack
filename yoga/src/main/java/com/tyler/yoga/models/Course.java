package com.tyler.yoga.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="courses")
public class Course {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotEmpty(message="Course Name is required!")
    @Size(min=3, max=30, message="Title must be between 3 and 30 characters")
    private String courseName;
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="user_id")
	    private User instructor;
    
    @NotEmpty(message="Weekday are required!")
    private String weekday;
    
    @NotEmpty(message="Description is required!")
    private String description;
    
    
    private String teacher;
    
    @NotNull
	@Min(value = 0, message="price needs to be more than 1 dollar")
    private int price;
    
    @Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
    @Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
    
    
	public Course() {
		
	}
	public Course(
			@NotEmpty(message = "Course Name is required!") @Size(min = 3, max = 30, message = "Title must be between 3 and 30 characters") String courseName,
			@NotEmpty(message = "Instructor is required!") User instructor,
			@NotEmpty(message = "Weekday are required!") String weekday,
			@NotEmpty(message = "Description is required!") String description,
			String teacher,
			@NotEmpty(message = "Price is required!") int price) {
		this.courseName = courseName;
		this.instructor = instructor;
		this.weekday = weekday;
		this.description = description;
		this.teacher = teacher;
		this.price = price;
	}
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getInstructor() {
		return instructor;
	}
	public void setInstructor(User instructor) {
		this.instructor = instructor;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
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
	public void setClassName(String courseName) {
		this.courseName = courseName;
	}
	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
