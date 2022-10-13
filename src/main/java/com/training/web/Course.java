package com.training.web;
import javax.persistence.*;

@Entity
@Table(name="COURSES_DB_TEST")
public class Course {
	

	@Id
	@Column(name="course_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="course_name")
	private String name;
	
	@Column(name="course_duration")
	private int durationDays;
	
	@Column(name="course_fee")
	private int fee;
	
	Course(){
		
	}

	public Course(String name, int durationDays, int fee) {
		super();
		this.name = name;
		this.durationDays = durationDays;
		this.fee = fee;
	}

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

	public int getDurationDays() {
		return durationDays;
	}

	public void setDurationDays(int durationDays) {
		this.durationDays = durationDays;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	

}
