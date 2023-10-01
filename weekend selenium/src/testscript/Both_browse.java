package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Both_browse 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Thread.sleep(3000);
		Driver.get("https://admin.hpsmart.com");
		String title=Driver.getTitle();
		System.out.print(title);
		String url=Driver.getCurrentUrl();
		System.out.print(url);
		String page = Driver.getPageSource();
		System.out.print(page);
		
		
		
			
		
	}

}	