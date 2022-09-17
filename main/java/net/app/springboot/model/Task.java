package net.app.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tasktable")
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private long id;
	
   @Column(name="title")	
   private String title;
   

   @Column(name="description")	
   private String description;
   
   @Column(name="createdBy")
   private String createdBy;
   
   @Column(name="assignedTo")
   private String assignedTo;
   
   @Column(name="completedOn")
   private String completedOn;
   
   
   public Task(){
   //default constructor
   }
   
   // parameterized constructor

public Task(long id, String title, String description, String createdBy, String assignedTo, String completedOn) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
	this.createdBy = createdBy;
//	this.assignedTo = assignedTo;
//	this.completedOn = completedOn;
}



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

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getCreatedBy() {
	return createdBy;
}

public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}

public String getAssignedTo() {
	return assignedTo;
}

public void setAssignedTo(String assignedTo) {
	this.assignedTo = assignedTo;
}

public String getCompletedOn() {
	return completedOn;
}

public void setCompletedOn(String completedOn) {
	this.completedOn = completedOn;
}

//getters and setters

private String status;

// getter n setters
public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

// constructor
public Task(String status) {
	super();
	this.status = status;
}


}
   
  