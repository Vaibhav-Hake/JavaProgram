package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIfram {
public static void main(String[] args) throws InterruptedException {
	///here we also use index concept
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demo.automationtesting.in/Frames.html");
	Thread.sleep(2000);
	d.findElement(By.linkText("Iframe with in an Iframe")).click();
	WebElement outerFrame = d.findElement(By.cssSelector("#Multiple>iframe"));
	d.switchTo().frame(outerFrame);
	Thread.sleep(2000);
	WebElement innnerFrame = d.findElement(By.cssSelector(".iframe-container>iframe"));
	d.switchTo().frame(innnerFrame);
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@type='text']")).sendKeys("Vaibhav");
	Thread.sleep(2000);
	
}
}
