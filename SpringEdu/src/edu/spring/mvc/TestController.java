package edu.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("third")
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
	
	@RequestMapping("first") //<- ������ �ּ�(URL)
	public String first(HttpServletRequest req) { // �޼ҵ�� ����, �ߺ����� �ʰ�!
		String key = req.getParameter("key");
		System.out.println(key);
		
		return "first"; // <- View�� ���� jsp ���ϸ�
		// /WEB-INF/views/first.jsp
	}
}









