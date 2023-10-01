package testscript;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amzon 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[.='Results']/../../../../../../div[3]//span[contains(.,'Apple')]"));
		ele.click();
		Thread.sleep(2000);
	
		Set<String> all_links=driver.getWindowHandles();
		ArrayList<String> l =new ArrayList<String>(all_links);
		String id = l.get(1);
		driver.switchTo().window(id);
		Thread.sleep(2000);
		driver.findElement(By.id("buy-now-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("8095590130");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("continue")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("cvf-input-code")).sendKeys("");
		Thread.sleep(12000);
		driver.findElement(By.xpath("//span[.='Continue']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("pp-sDgxvY-98")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[.=' Another payment method']/../../../div[2]//a[.='Enter card details']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("addCreditCardNumber")).sendKeys("5089440068579599");
		
		

		
		

}}
