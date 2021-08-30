package org.sample.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest1 {
	@Test(groups = "@smoke")
	private void tc0() {
		Assert.assertTrue(false);
		System.out.println("Method 0");
	}

	@Test(groups = "@sanity", dependsOnMethods = "tc0", alwaysRun = true)
	private void tc1() {
		System.out.println("Method 1");

	}

	@Test(groups = "@smoke")
	private void tc2() {

		System.out.println("Method 2");

	}

	@Test(groups = "@E2E")
	private void tc3() {
		System.out.println("Method 3");
	}

	@Test(groups = "@Retest")
	private void tc4() {
		System.out.println("Method 4");

	}

}
