package Test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
public static void main(String[] args) throws InterruptedException {
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
		act.keyDown(Keys.PAGE_DOWN).perform();
		//act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector(".recipient-name")).sendKeys("Vaibhav");
		Thread.sleep(2000);
		d.findElement(By.cssSelector(".recipient-email")).sendKeys("V@gmail.com");
		Thread.sleep(2000);
		
		WebElement q = d.findElement(By.cssSelector(".qty-input"));
		q.clear();
		q.sendKeys("2");
		Thread.sleep(2000);
		
		d.findElement(By.cssSelector(".add-to-cart-button")).click();
		Thread.sleep(4000);
		
		d.findElement(By.cssSelector(".cart-label")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector(".ico-logout")).click();
		Thread.sleep(2000);
		d.quit();
		
		
	}else {
		
	}
}

}
