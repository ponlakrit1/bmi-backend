package com.example.training62.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bmi")
public class bmiEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bmi_no")
    private long bmiNo;

    @Column(name="student_id")
    private String studentId;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="age")
    private int age;

    @Column(name="weight")
    private float weight;

    @Column(name="height")
    private float height;

}
