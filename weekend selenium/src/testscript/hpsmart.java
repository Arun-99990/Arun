package testscript;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hpsmart 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://admin.hpsmart.com/connect");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Create Account']/..")).click();
		Thread.sleep(9000);
		//driver.findElement(By.xpath("//input[@id='firstName']/..")).sendKeys("osv");
		//driver.findElement(By.xpath("//a[@id='sign-in']")).click();		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('firstName').value='abc'");
			
	}	

}
