package edu.spring.bean;

public class Develop {
	private Emp emp;
	
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	public Develop() {}

	public Develop(Emp emp) {
		this.emp = emp;
	}

	public void coding() {
		emp.gotoOffice();
		System.out.println("ȸ�翡�� ���ϴ� ��");
		emp.getOffWork();
	}
}