package org.testscript;

import org.helper.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{
	
	@BeforeTest
	private void start() {
		launchChrome("https://www.zalando.dk/");
		maxWindow();
	}
	
	@Test
	private void findShoe() {
		System.out.println("Done");
	}
	
	@Test(priority = 1)
	private void findSunglasses() {
		System.out.println("Will Done");
	}
	
	@AfterTest
	private void end() {
		quitBrowser();
	}

}
