package com.example.learnSpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses()
	{
		return Arrays.asList(
				new Course(1,"Learn AWS","udemy"),
				new Course(2,"Java Bootcamp","udemy"),
				new Course(3,"JUnit testing","udemy"));
				
	}

}
