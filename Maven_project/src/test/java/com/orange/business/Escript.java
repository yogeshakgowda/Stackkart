package com.orange.business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.orange.element.End1;
import com.orange.generic.Base;

public class Escript extends Base
{
@Test
public void script() throws InterruptedException
{
	End1 en=new End1(driver);
	en.getpim().click();
	Thread.sleep(3000);
	en.getadd_emp().click();
	Thread.sleep(3000);
	en.getUpload_btn().sendKeys("C:\\Users\\HP\\Downloads\\motorola-razr-40-ultra-256-gb-infinite-black-8-gb-ram-.jpg");
	Thread.sleep(5000);
	en.getFirst_name().sendKeys("yogi");
	Thread.sleep(3000);
	en.getMiddle_name().sendKeys("gowda");
	en.getLastName().sendKeys("K");
	en.getSubmit().click();
}

}
