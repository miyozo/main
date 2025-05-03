package jp.kwebs.forms.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TextboxController {
	
	@GetMapping("/textbox")
	public String enter() {
		return "textbox-enter";
	}
	
	@PostMapping("/textbox")
	public String result(@RequestParam String title, Model model) {
		model.addAttribute("title", title);
		return "textbox-result";
	}
}


