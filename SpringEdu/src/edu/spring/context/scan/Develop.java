package edu.spring.context.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // 외부조립기에서 읽어들이는 대상
public class Develop {
	@Autowired 
	@Qualifier("programmer")  // Bean이 두개 이상 존재할때 사용 
//	@Resource(name = "programmer")  // Bean이 두개 이상 존재할때 사용
	private Emp emp;
	
	public void coding() {
		emp.gotoOffice();
		System.out.println("회사에서 일하는 중");
		emp.getOffWork();
	}
}