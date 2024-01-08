package com.orange.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base1
{
	@FindBy(xpath = "//input[@name='username']")
	private WebElement user_name;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pass_word;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login_btn;
	
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	private WebElement logout_dropdown;
	
	@FindBy(xpath="(//a[contains(text(),'out')])[2]")
	private WebElement logout_btn;
	
	public Base1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUser_name() {
		return user_name;
	}
	
	public WebElement getpass_word() {
		return pass_word;
	}
	
	public WebElement getLogin_button() {
		return login_btn;
	}
	
	public WebElement getlogout_drop() {
		return logout_dropdown;
	}
	
	public WebElement getlogout_btn() {
		return logout_btn;
	}
}
