package com.liuyan.maven.helloword;
import org.junit.Test;
import org.junit.Assert;

public class TestHelloWorld {

	@Test
	public void testSayHello() {
		HelloWorld helloWorld = new HelloWorld();
		Assert.assertEquals(helloWorld.sayHello(), "hello maven hello maven");
	}

}
