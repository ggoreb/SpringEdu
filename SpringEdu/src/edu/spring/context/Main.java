package edu.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	// 1번 main 메소드 실행
	public static void main(String[] args) {
		// 2번 외부조립기 동작(Bean 등록)
		ApplicationContext con = new 
				ClassPathXmlApplicationContext(
					"edu/spring/context/config.xml");
		
		// 3번 등록되어 있는 Bean 활용?
		Develop dev = (Develop) con.getBean("develop"); // <== bean id
		dev.coding();
		
	}
}





