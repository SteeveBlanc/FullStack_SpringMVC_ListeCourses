package com.java.tutorials.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bonjour/{personne}")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
    public String afficherBonjour(final ModelMap pModel, @PathVariable(value="personne") final String personneParam) {
        pModel.addAttribute("personne", personneParam);
        return "bonjour";
    }
}
