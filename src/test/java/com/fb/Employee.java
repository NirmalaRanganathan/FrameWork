package com.fb;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.Test;

import graphql.Assert;

public class Employee {
	
	@Test(dependsOnGroups = {"smoke"},alwaysRun=true,groups= {"Reg"})
	
	private void test1() {

	}
	@Test(groups = "smoke")
	private void test2() {
		Assert.assertTrue(false);

	}
	@Test
	private void test3() {

	}
}



	
	

