package com.skillstorm.beans;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Course {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String title;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date start;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date end;
	
	@ManyToMany(mappedBy = "courses") // Look at the other side, it is all already taken care off. (Student.Java).
	private Set<Student> students;
	
	@OneToMany(mappedBy = "course")
	private Set<Textbook> books;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", start=" + start + ", end=" + end + ", students=" + students
				+ "]";
	}
	
}
