package edu.spring.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MyClass {
	int age;
	String name;
	@Override
	public String toString() {
		return "MyClass [age=" + age + ", name=" + name + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("a", "111");
		map.put("b", "222");
		System.out.println(map);
		System.out.println(map.hashCode());
		
		MyClass mc = new MyClass();
		mc.age = 10;
		mc.name = "AAA";
		System.out.println(mc);
	}
}








