package edu.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("edu/spring/test/config.xml");
		Email email = (Email) context.getBean("email");
		email.send();
		
		Email eee = null;
		eee.send();
		
		UserDao userDao = (UserDao) context.getBean("userDao");
		System.out.println(userDao.getUserInfo());

		UserDao userDao2 = context.getBean("userDao", UserDao.class);
		System.out.println(userDao2.getUserInfo());

		System.out.println(userDao == userDao2);
	}

}
