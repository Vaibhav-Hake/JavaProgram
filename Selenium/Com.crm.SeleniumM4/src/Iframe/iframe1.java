package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demo.automationtesting.in/Frames.html");
	Thread.sleep(2000);
	///way 1 with using index
	//d.switchTo().frame(0);
	///way 2 using either name or id String type
	//d.switchTo().frame("singleframe");
	/// Way 3 using webElement 
	WebElement iframe = d.findElement(By.id("singleframe"));
	d.switchTo().frame(iframe);
	d.findElement(By.xpath("//input[@type='text']")).sendKeys("Vaibhav");
	Thread.sleep(2000);

	d.quit();
	
}
}
