package com.mycompany.myapp;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		FormModel fm = new FormModel();
		model.addAttribute("name", "クソ虫");
		model.addAttribute("data", fm);
		return "home";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String pome(Locale locale, @ModelAttribute FormModel fm, Model model) {
		Dimpl dao = new Dimpl();
		List<FormModel> fuck = dao.getAll();
		dao.add(fm);
		if ("".equals(fm.getName())) {
			model.addAttribute("name", "ゴミ虫");
		} else {
			model.addAttribute("name", fm.getName());
		}
		model.addAttribute("data", fm);
		model.addAttribute("fuck", fuck);
		return "home";
	}

}
