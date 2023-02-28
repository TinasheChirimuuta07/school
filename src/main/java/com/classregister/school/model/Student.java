package com.classregister.school.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   // removes boiler code by implicitly inserting getters, setters  and constructors
@Entity() //maps our java  object  to the database
@NoArgsConstructor // no args constructor
@AllArgsConstructor
@Builder
public class Student {
@Id
@SequenceGenerator( name = "id-sequence"
, sequenceName = "id-sequence" ,allocationSize = 1)

@GeneratedValue(strategy = GenerationType.SEQUENCE,
generator ="id-sequence")
@Column(name="national_id",nullable = false , updatable = false, unique = true)
private Integer id;
    @Column(name="student_first_name", columnDefinition = "TEXT")
    private String studentFirstName;
    @Column(name="student_surname",columnDefinition = "TEXT")
    private String studentSurname;
    @Column(name="student_class")
    private Integer classs;



    @Column(name="national_id",nullable = false , updatable = false)
    private String nationalId;


}
