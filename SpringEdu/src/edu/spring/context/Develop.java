package edu.spring.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Develop {
//	@Autowired 
//	@Qualifier("programmer")  // Bean이 두개 이상 존재할때 사용 
//	@Resource(name = "programmer")  // Bean이 두개 이상 존재할때 사용
	private Emp emp;
	
	public void coding() {
		emp.gotoOffice();
		System.out.println("회사에서 일하는 중");
		emp.getOffWork();
	}
}