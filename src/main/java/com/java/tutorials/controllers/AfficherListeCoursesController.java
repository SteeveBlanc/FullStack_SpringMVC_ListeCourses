package com.java.tutorials.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.tutorials.models.Course;
import com.java.tutorials.services.IServiceListeCourse;

@Controller
@RequestMapping(value="/listeCourses")
public class AfficherListeCoursesController {

	@Autowired
	private IServiceListeCourse service;
	
	@RequestMapping(method = RequestMethod.GET)
	public String afficher(ModelMap modelParam){
		final List<Course> lListeCourses = service.rechercherCourses();
        modelParam.addAttribute("listeCourses", lListeCourses);
        return "listeCourses";
	}
	
}
