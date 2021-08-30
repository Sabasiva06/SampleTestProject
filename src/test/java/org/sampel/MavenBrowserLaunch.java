package org.sampel;

import java.util.Date;
import org.base.LibGlobal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locator.LoginPage;
import org.openqa.selenium.WebElement;

public class MavenBrowserLaunch extends LibGlobal {
	static LibGlobal global;

	@BeforeClass
	public static void beforeClass() {
		global = new LibGlobal();
		global.getDriver("chrome");
		global.launhUrl("https://www.facebook.com/");
		
		

	}

	@Before
	public void beforeMethod() {
		Date date = new Date();
		System.out.println(date);

	}

	@Test
	public void tc0() {
		WebElement findById = global.findById("id", "email");
		global.typeText(findById, "hiii");
	}
	@After
	public void afterMethod() {
		Date date = new Date();
		System.out.println(date);

	}
	@AfterClass
	public static void afterClass() {
		driver.quit();

	}
}
