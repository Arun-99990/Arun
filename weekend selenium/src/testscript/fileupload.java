package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class fileupload
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/SArun/Desktop/popup.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@id='f1']"));
		Thread.sleep(2000);
		ele.sendKeys("C:\\Users\\SArun\\Desktop\\popup.html");
		
		
		
		
	}

}
