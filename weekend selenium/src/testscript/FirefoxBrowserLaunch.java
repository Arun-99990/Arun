package testscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//which browser should be launched
		String key="webdriver.chrome.driver";
		String key1="webdriver.gecko.driver";
		//which is the driver executable file
		String value="./softwares/chromedriver.exe";
		String value1="./softwares/geckodriver.exe";
		//create commi btw server and driver
		System.setProperty(key, value);
		System.setProperty(key1, value1);
		//launch empty firefox browser
		ChromeDriver ch = new ChromeDriver();
		Thread.sleep(5000);
		ch.quit();
		FirefoxDriver fh = new FirefoxDriver();
		

	}

}
