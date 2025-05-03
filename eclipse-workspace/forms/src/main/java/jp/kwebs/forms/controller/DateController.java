package jp.kwebs.forms.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DateController {
	
	@GetMapping("/date")
	public String enter() {
		return "date-enter";
	}
	
	@PostMapping("/date")
	public String result(@RequestParam LocalDate birthday, Model model) {
		model.addAttribute("birthday", birthday); 
		/*1つ目の"birthday"はdate-enter.html内のname属性を指定、２つ目のbirthdayはデータの値を指定？*/
		return "date-result";
	}

}
