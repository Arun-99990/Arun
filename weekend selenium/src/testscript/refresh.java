package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class refresh 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//input[@value='Go']"));
	
}
}
