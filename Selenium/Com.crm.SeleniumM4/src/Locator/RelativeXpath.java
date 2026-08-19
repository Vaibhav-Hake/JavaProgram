package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	
//	d.findElement(By.xpath("//input[@value='Add to cart']")).click();
//	Thread.sleep(2000);
//	
//	d.findElement(By.xpath("//img[contains(@alt,'Tri')]")).click();
//	Thread.sleep(2000);
//	
//	d.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
//	Thread.sleep(2000);
//	d.findElement(By.xpath("//span[@title='Close']")).click();
//	d.findElement(By.xpath("//span[text()='Shopping cart']")).click();
//	Thread.sleep(1000);
	d.findElement(By.xpath("(//input)[3]")).sendKeys("Hii");
}
}
