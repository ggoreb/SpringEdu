package edu.spring.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Develop {
//	@Autowired 
//	@Qualifier("programmer")  // Bean�� �ΰ� �̻� �����Ҷ� ��� 
//	@Resource(name = "programmer")  // Bean�� �ΰ� �̻� �����Ҷ� ���
	private Emp emp;
	
	public void coding() {
		emp.gotoOffice();
		System.out.println("ȸ�翡�� ���ϴ� ��");
		emp.getOffWork();
	}
}