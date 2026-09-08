package Test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {
public static void main(String[] args) throws InterruptedException {
	String fburl="https://www.facebook.com/nopCommerce";

	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	
	String url = d.getCurrentUrl();
	System.out.println(url);
	if(url.equals("https://demowebshop.tricentis.com/")) {
		d.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		d.findElement(By.id("Email")).sendKeys("vhake45@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.id("Password")).sendKeys("Vaibhav@14");
		Thread.sleep(2000);
		d.findElement(By.cssSelector(".login-button")).click();
		Thread.sleep(2000);
		Actions act=new Actions(d);
		String dws_handle = d.getWindowHandle();
		System.out.println("dws_handle : "+dws_handle);
		act.keyDown(Keys.PAGE_DOWN).perform();
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);

		List<WebElement> ecomerse_link = d.findElements(By.xpath("//a[@target='_blank']"));
		for (WebElement link : ecomerse_link) {
			link.click();
			Thread.sleep(1000);
		}
		Set<String> all_handlers = d.getWindowHandles();
	}
}
}
