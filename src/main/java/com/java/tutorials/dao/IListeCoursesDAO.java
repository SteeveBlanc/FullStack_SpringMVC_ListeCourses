package com.java.tutorials.dao;

import java.util.List;

import com.java.tutorials.models.Course;

public interface IListeCoursesDAO {
	List<Course> rechercherCourses();
	void creerCourse(final Course pCourse);
	void supprimerCourse(final Course pCourse);
	void modifierCourse(final Course pCourse);
}
