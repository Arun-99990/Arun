package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=qspider&rlz=1C1RXQR_enIN1066IN1066&oq=qspider&aqs=chrome.0.69i59.72038j0j4&sourceid=chrome&ie=UTF-8");
		List<WebElement> all_links = driver.findElements(By.xpath("//h3"));
		for(WebElement ele: all_links)
		{
			String text=ele.getText();
			System.out.println(text);
		}
		
		
		
	}

}
