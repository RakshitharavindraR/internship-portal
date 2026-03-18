package com.internshipportal.model;

import jakarta.persistence.*;
@Entity
public class Internship {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String title;
private String company;
private String description;
}