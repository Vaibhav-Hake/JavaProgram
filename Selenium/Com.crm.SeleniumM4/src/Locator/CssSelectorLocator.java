package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Laptop");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
	Thread.sleep(2000);
}
}
