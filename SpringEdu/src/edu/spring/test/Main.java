package edu.spring.test;

import javax.swing.JFrame;

class Data {
	int score;
	Data(int s) {
		this.score = s;
	}
	Data() {}
	void set(int s) {
		this.score = s;
	}
}
public class Main {
	public static void main(String[] args) {
		Data d = new Data();
		
//		JFrame j = new JFrame("����");
		
		JFrame j = new JFrame();
		j.setTitle("����");
		j.setSize(300, 200);
		j.setVisible(true);
	}
}








