package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String studentID;
    private String name;
    private String dateIn;

    public Integer getId() {
		return id;
	}

    public String getStudentID() {
        return studentID;
    }
    public String getDateIn() {
        return dateIn;
    }
    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
