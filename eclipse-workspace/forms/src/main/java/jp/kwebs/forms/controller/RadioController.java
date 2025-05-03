package jp.kwebs.forms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RadioController {
	
	@GetMapping("/radio")
	public String enter() {
		return "radio-enter";
	}

	@PostMapping("/radio")
	public String result(@RequestParam String size ,Model model) {
		model.addAttribute("size" ,size);
		return "radio-result";
	}
}
