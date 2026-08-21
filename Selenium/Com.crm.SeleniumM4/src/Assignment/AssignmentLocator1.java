package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLocator1 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.className("ico-register")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.className("ico-login")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.className("ico-cart")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.className("ico-wishlist")).click();
	 Thread.sleep(2000);
	 
	 driver.close(); 
     
}
}
