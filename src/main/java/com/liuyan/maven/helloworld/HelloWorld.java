package com.liuyan.maven.helloworld;

public class HelloWorld {
	public String sayHello() {
		return "hello maven";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new HelloWorld().sayHello());

}
	
}
