package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentIndirectLocator2 {
public static void main(String[] args) throws InterruptedException {
	 ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector(".ico-login")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("#Email")).sendKeys("vhake45@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("#Password")).sendKeys("Vaibhav@14");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector(".login-button")).click();
     	 Thread.sleep(2000);
		 driver.findElement(By.cssSelector(".buttons>.product-box-add-to-cart-button")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector(".recipient-name")).sendKeys("v");
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector(".recipient-email")).sendKeys("vhake05@gmail.com");
		 Thread.sleep(1000);
		 
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector(".message")).sendKeys("This gift card for you");
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector(".qty-input")).clear();
		 driver.findElement(By.cssSelector(".qty-input")).sendKeys("2");
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("#add-to-cart-button-2")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector(".ico-cart")).click();
		 driver.findElement(By.cssSelector(".remove-from-cart")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector(".update-cart-button")).click();
		 
		 Thread.sleep(1000);
		 driver.close();
		 
}
}
