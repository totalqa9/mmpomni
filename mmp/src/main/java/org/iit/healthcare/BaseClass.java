package org.iit.healthcare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	protected WebDriver driver;
	@BeforeTest
	public void instantiateDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

}
