package edu.spring.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAttributeController {
	@RequestMapping("search/content2.do")
	public ModelAndView content2(@RequestParam("title") String title) {
		ModelAndView mav = new ModelAndView("result");
//		mav.addObject("title", title);
		Content c = new Content();
		c.setTitle(title);
		mav.addObject("content", c);
		return mav;
	}

	@RequestMapping("search/content.do")
	public ModelAndView content1(
			@ModelAttribute("content") Content content) {
		return new ModelAndView("result");
	}
	
	@ModelAttribute("searchTypeList")
	public List<String> searchTypeList() {
		List<String> options = new ArrayList<String>();
		options.add("전체");
		options.add("아이템");
		options.add("캐릭터");
		return options;
	}
}