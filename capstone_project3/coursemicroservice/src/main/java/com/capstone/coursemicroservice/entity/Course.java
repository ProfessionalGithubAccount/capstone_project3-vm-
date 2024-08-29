package com.capstone.coursemicroservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Course {
    @Id
    private Integer courseId;
    private String courseName;
    private String studentIds; // Comma-separated string
    private List<Integer> assignmentIds;
    private String description;
    private Integer professorId;
    private String semester;

}
