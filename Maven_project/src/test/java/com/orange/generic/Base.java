package com.orange.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orange.element.Base1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base implements FrameCon
{
	public WebDriver driver;
	public Base1 bs;
@BeforeClass
public void openapp() throws InterruptedException
{
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	Thread.sleep(10000);
}
@BeforeMethod
public void loginapp() throws InterruptedException
{
	bs=new Base1(driver);
	bs.getUser_name().sendKeys(Username);
	bs.getpass_word().sendKeys(password);
	bs.getLogin_button().click();
	Thread.sleep(5000);
}
@AfterMethod
public void logged()
{
	bs.getlogout_drop();
	bs.getlogout_btn();
}
@AfterClass
public void clos() {
	driver.quit();
}
}
