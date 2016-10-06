package com.test.mavenTest;

import org.testng.annotations.Test;

import com.test.maven.Test1;

public class RandomTest {

	@Test
	public static void run(){
	Test1 test = new Test1();
	test.test();
	test.view();
	}
}
