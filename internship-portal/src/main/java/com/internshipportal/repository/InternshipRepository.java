package com.internshipportal.repository;

import com.internshipportal.model.Internship;
import org.springframework.data.jpa.repository.JpaRepository;
public interface InternshipRepository extends JpaRepository<Internship, Long> {}