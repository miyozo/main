package jp.kwebs.forms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TextareaController {

	@GetMapping("/textarea")
	public String enter() {
		return "textarea-enter";
	}
	
	@PostMapping("/textarea")
	public String result(@RequestParam String message, Model model) {
		model.addAttribute("message" ,message);
		return "textarea-result";
	}
}
