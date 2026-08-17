package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
	
	WebElement searchFild=d.findElement(By.tagName("input"));
	searchFild.sendKeys("Helloo!!!");
	
	Thread.sleep(2000);
	d.findElement(By.name("pollanswers-1")).click();
	
	Thread.sleep(2000);
	d.findElement(By.id("pollanswers-2")).click();
	
	Thread.sleep(2000);
	WebElement register=d.findElement(By.className("ico-register"));
}
}
