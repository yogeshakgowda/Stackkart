package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
@Test
public void script() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yogi052k@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Yogi@1993");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Search Facebook']")).sendKeys("virat kohli");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Sportsperson']")).click();
	Thread.sleep(2000); 
	driver.findElement(By.xpath("//div[@aria-label='Follow']")).click();
	Thread.sleep(5000);
	driver.quit();
}
}
