package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"sb_ifc51\"]")).sendKeys("Hassan");
	    //driver.findElement(By.linkText("google")).click();
		//Thread.sleep(5000);
		
		
				}

}
