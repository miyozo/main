package jp.kwebs.forms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckboxController {
	
	@GetMapping("/checkbox")
	public String enter() {
		return "checkbox-enter";
	}
	
	@PostMapping("/checkbox")
	public String result(@RequestParam List<String> article, Model model) {
		model.addAttribute("article" ,article);
		return "checkbox-result";
	}
}
