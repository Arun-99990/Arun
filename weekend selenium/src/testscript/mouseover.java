package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//div[.='Fashion'])[1]"));
		WebElement ele1 = driver.findElement(By.xpath("(//div[.='Electronics'])[1]"));
		WebElement ele2 = driver.findElement(By.xpath("(//div[.='Home & Furniture'])[1]"));
		WebElement ele3 = driver.findElement(By.xpath("(//div[.='Appliances'])[1]"));
		WebElement ele4 = driver.findElement(By.xpath("(//div[.='Travel'])[1]"));
		WebElement ele5 = driver.findElement(By.xpath("(//div[.='Beauty, Toys & More'])[1]"));
		WebElement ele6 = driver.findElement(By.xpath("(//div[.='Two Wheelers'])[1]"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		a.moveToElement(ele1).perform();
		Thread.sleep(2000);
		a.moveToElement(ele2).perform();
		Thread.sleep(2000);
		a.moveToElement(ele3).perform();
		Thread.sleep(2000);
		a.moveToElement(ele4).perform();
		Thread.sleep(2000);
		a.moveToElement(ele5).perform();
		Thread.sleep(2000);
		a.moveToElement(ele6).perform();
		
		
		
	}

}
