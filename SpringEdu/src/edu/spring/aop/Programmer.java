package edu.spring.aop;

import org.springframework.stereotype.Service;

@Service
public class Programmer implements Emp {
	@Override
	public void gotoOffice() {
		System.out.println("���α׷��� ���");
	}

	@Override
	public void getOffWork() {
		System.out.println("���α׷��� ���");
	}
}