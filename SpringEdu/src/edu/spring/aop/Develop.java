package edu.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // �ܺ������⿡�� �о���̴� ���
public class Develop {
	@Autowired 
	@Qualifier("designer")  // Bean�� �ΰ� �̻� �����Ҷ� ��� 
//	@Resource(name = "programmer")  // Bean�� �ΰ� �̻� �����Ҷ� ���
	private Emp emp;
	
	public void coding() {
		emp.gotoOffice();
		System.out.println("ȸ�翡�� ���ϴ� ��");
		emp.getOffWork();
	}
}