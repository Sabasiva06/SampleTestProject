package org.sampel;

import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\12.30PmFrameworkJuneBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("welcomeJava");
		// It is used to refresh the webpage
		driver.navigate().refresh();
		txtUserName.sendKeys("hijavaaa");
		WebElement txtUserName1 = driver.findElement(By.id("username"));
		txtUserName1.sendKeys("welcomeJava");
		// It is used to refresh the webpage
		driver.navigate().refresh();
		txtUserName1.sendKeys("hijavaaa");
		WebElement txtUserName2 = driver.findElement(By.id("username"));
		txtUserName2.sendKeys("welcomeJava");
		// It is used to refresh the webpage
		driver.navigate().refresh();
		txtUserName.sendKeys("hijavaaa");
		WebElement txtUserName3 = driver.findElement(By.id("username"));
		txtUserName3.sendKeys("welcomeJava");
		// It is used to refresh the webpage
		driver.navigate().refresh();
		txtUserName.sendKeys("hijavaaa");

	}
}
