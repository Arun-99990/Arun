package testscript;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class facebook 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AXo7B7VdmXvGrKW6ebHdkBUBdKq6pWltA728otp-B42W5uq54XLCEN1hl2DuOnlIXUdAxnd4Sgoh&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-905857663%3A1692517996060243");
		//Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("arunhassan001@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("login")).click();
		//Thread.sleep(000);
		
		
		
	}

}
