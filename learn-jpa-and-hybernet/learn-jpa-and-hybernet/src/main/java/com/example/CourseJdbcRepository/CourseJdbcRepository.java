package com.example.CourseJdbcRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	private static final String INSERT_QUERY =
		    "INSERT INTO course (id, name, author) VALUES (?, ?, ?)";

	public void insert() {
	    springJdbcTemplate.update(INSERT_QUERY, 1, "Learn Udemy Course", "Udemy");
	}


	}
