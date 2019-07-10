package edu.spring.transaction.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = { 
				"classpath:edu/spring/transaction/service/config.xml" 
		})
public class BuyServiceTest {
	@Autowired
	BuyService bs;
	
	@Test
	public void select() {
		//   구매자ID    상품ID
		bs.buy("a", 1);
		// 가입되어 있는 구매자ID, 등록되어 있는 상품ID
	}
}






