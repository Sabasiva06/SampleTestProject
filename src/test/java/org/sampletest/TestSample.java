package org.sampletest;

import java.util.Date;

import org.base.LibGlobal;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locator.LoginPage;
import org.openqa.selenium.WebElement;

public class TestSample extends LibGlobal {
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
	public void tco() {
		LoginPage page = new LoginPage();
		WebElement txtUserName = page.getTxtUserName();
		typeText(txtUserName, global.getDataFromExcel("Sheet1", 1, 0));
		WebElement txtPassword = page.getTxtPassword();
		typeText(txtPassword, global.getDataFromExcel("Sheet1", 1, 1));

	}

	@After
	public void afterClass() {
		Date date = new Date();
		System.out.println(date);

	}

}
