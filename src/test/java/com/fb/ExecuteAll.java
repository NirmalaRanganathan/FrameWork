package com.fb;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExecuteAll {
	
	@Test (dependsOnMethods="test2",alwaysRun=true)
	private void test1() {

	}
@Test
private void test2() {
Assert.assertTrue(false);

}
@Test
private void test3() {

}
	
	

}
