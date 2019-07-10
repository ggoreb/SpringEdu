package edu.spring.jdbc;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.jdbc.MemberDto;
import edu.spring.jdbc.MemberService;

public class MemberDaoTest2 {

	@Test
	public void insert() {
		ApplicationContext con = 
			new ClassPathXmlApplicationContext(
				"edu/spring/jdbc/config.xml");
		MemberService ms = (MemberService) con.getBean("memberService");
		MemberDto memberDto = new MemberDto();
		memberDto.setId("bb");
		memberDto.setPw("11");
		memberDto.setName("°¡°¡");
		ms.addMember(memberDto);
	}

}




