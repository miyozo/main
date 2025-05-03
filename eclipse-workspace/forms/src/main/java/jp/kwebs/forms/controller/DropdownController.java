package jp.kwebs.forms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DropdownController {
	
	@GetMapping("/dropdown")
	public String enter() {
		return "dropdown-enter";
	}
		
	@PostMapping("/dropdown")
	public String result(@RequestParam String city, Model model) {
		model.addAttribute("city" ,city);
		return "dropdown-result";
	}
}
