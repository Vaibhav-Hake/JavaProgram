package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathTraversing {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	//parent to child
	d.findElement(By.xpath("//ul[@class='poll-options']/li[2]/input")).click();
	Thread.sleep(2000);
	// //Child forword traversing
	d.findElement(By.xpath("//input[@id='pollanswers-4']/following-sibling::label")).click();
	Thread.sleep(2000);
	 //Child backword traversing
	d.findElement(By.xpath("//label[@for='pollanswers-3']/preceding-sibling::input")).click();
	Thread.sleep(2000);
	  //child to parent
	d.findElement(By.xpath("//span[text()='Wishlist']/..")).click();
	Thread.sleep(2000);
}
}
