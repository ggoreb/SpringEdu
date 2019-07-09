package edu.spring.bean;

import java.util.Random;

import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	// 1�� main �޼ҵ� ����
	public static void main(String[] args) {
		// 2�� �ܺ������� ����(Bean ���)
		ApplicationContext con = new 
				ClassPathXmlApplicationContext("edu/spring/bean/config.xml");
		JFrame jf = (JFrame) con.getBean("jf");
		jf.setSize(300, 200);
//		jf.setVisible(true);
		
		String str = (String) con.getBean("str");
		System.out.println(str);
		
//		Random random = new Random();
//		int num = random.nextInt(45);
//		System.out.println(num);
		
		Random ran = (Random) con.getBean("random");
		int n = ran.nextInt(6);
		System.out.println(n);
		
		
		// 3�� ��ϵǾ� �ִ� Bean Ȱ��?
		Develop dev = (Develop) con.getBean("develop"); // <== bean id
		dev.coding();
		
		Develop dev2 = (Develop) con.getBean("develop2");
		dev2.coding();
	}
}





