package edu.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con = new 
			ClassPathXmlApplicationContext(
				"edu/spring/jdbc/config.xml");
		MemberService ms = 
			(MemberService) con.getBean("memberService");
		MemberDto memberDto = new MemberDto();
		memberDto.setId("dddd2222");
		memberDto.setPw("1");
		memberDto.setName("bbb111");
		ms.addMember(memberDto);
	}
}









