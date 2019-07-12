package edu.spring.mvc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {
	@Autowired
	JdbcTemplate jt;
	
	@RequestMapping("data.do")
	@ResponseBody
	public List<Map<String, Object>> data() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM ACCIDENT");
		
		return jt.queryForList(sql.toString());
	}
}







