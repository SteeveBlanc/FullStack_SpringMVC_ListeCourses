package com.java.tutorials.services;

import java.util.List;

import com.java.tutorials.models.Course;

public interface IServiceListeCourse {
	List<Course> rechercherCourses();
	void creerCourse(final String pLibelle, final Integer pQuantite);
	void supprimerCourse(final Integer pIdCourse);
	void modifierCourses(final List<Course> pListeCourses);
	}
