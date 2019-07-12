package edu.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("board")
public class SessionAttributesController {
	@RequestMapping(value="edit", method=RequestMethod.GET)
	public String edit(Model model) {
		Content c = new Content();
		c.setTitle("제목입니다.");
		c.setWriteId("홍길동");
		model.addAttribute("board", c);
		return "form";
	}
	@RequestMapping(value="edit", 
			method=RequestMethod.POST)
	@ResponseBody
	public Content edit2(
		@ModelAttribute("board") Content c) {
		
		return c;
	}
}







