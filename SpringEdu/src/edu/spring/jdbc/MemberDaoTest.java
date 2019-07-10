package edu.spring.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberDaoTest {

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




