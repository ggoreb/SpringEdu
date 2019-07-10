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
		//   ������ID    ��ǰID
		bs.buy("a", 1);
		// ���ԵǾ� �ִ� ������ID, ��ϵǾ� �ִ� ��ǰID
	}
}






