package com.example.crudsys.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "persons")
public class Persons implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long matric_no;
    private String firstName;
    private String lastName;
    private String course;
    private String department;

    public Long getMatric_no() {
        return matric_no;
    }

    public void setMatric_no(Long matric_no) {
        this.matric_no = matric_no;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    private Long level;




    @Override
    public String toString()
    {
        return String.format(
                "Persons[matric_no=%d, firstName='%s', lastName='%s', course='%s', department='%s', level=%d]",
                matric_no, firstName, lastName, course, department, level);
    }

}