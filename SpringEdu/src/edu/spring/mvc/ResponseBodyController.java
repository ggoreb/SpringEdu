package edu.spring.mvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseBodyController {
	@RequestMapping("html/hello.do")
	@ResponseBody
	public String htmlHello() {
		return "<h1>��ο�</h1>";
	}

	@RequestMapping("json/vo.do")
	@ResponseBody
	public Content jsonVo(Content content) {
		content.setTitle("����");
		content.setWriteId("�ۼ���");
		return content;
	}

	@RequestMapping("json/map.do")
	@ResponseBody
	public Map<String, Object> jsonMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("title", "����1");
		resultMap.put("content", "����1");
		list.add(resultMap);
		resultMap = new HashMap<String, Object>();
		resultMap.put("title", "����2");
		resultMap.put("content", "����2");
		list.add(resultMap);
		map.put("list", list);
		return map;
	}

	@RequestMapping("json/list.do")
	@ResponseBody
	public List<Map<String, Object>> jsonHello() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("title", "����1");
		resultMap.put("content", "����1");
		list.add(resultMap);
		resultMap = new HashMap<String, Object>();
		resultMap.put("title", "����2");
		resultMap.put("content", "����2");
		list.add(resultMap);
		return list;
	}

	@RequestMapping("xml/vo.do")
	@ResponseBody
	public ContentXml xmlVo() {
		ContentXml content = new ContentXml();
		content.setTitle("����");
		content.setWriteId("�ۼ���");

		return content;
	}
}