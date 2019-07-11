package edu.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping(value="third", method=RequestMethod.GET)
	@ResponseBody
	public String third() {
		return "<h1>Hello</h1>";
	}
	
	@RequestMapping("test/second")
	public String second(
			@RequestParam("user_id") String user_id,
			Model model) {
		model.addAttribute("user_id", user_id);
		System.out.println(user_id);
		return "second";
	}
	
	@RequestMapping("first") //<- 접속할 주소(URL)
	public ModelAndView first(
			HttpServletRequest req) { // 메소드명 자유, 중복되지 않게!
		String key = req.getParameter("key");
		System.out.println(key);
		
		// jsp view 이름과 데이터 정보를 담음
		ModelAndView mav = new ModelAndView();
		mav.setViewName("first");
		mav.addObject("data", "Hello");
		return mav;
	}
}









