package edu.spring.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = { 
				"classpath:edu/spring/jdbc/config.xml" 
		})
public class MemberDaoSpringTest {
	@Autowired
	MemberService ms;
	
	@Value("${key}") String key;
	@Value("#{prop['key']}") String key2;

	@Test
	public void select() {
		System.out.println(key);
		System.out.println(key2);
		
		MemberDto memberDto = new MemberDto();
		memberDto.setId("zzzzzz11");
		memberDto.setPw("111");
		memberDto.setName("ccc1111");
		ms.addMember(memberDto);
	}
}






