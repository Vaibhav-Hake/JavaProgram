package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLocator3 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.className("ico-register")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.id("gender-male")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.name("FirstName")).sendKeys("Vaibhav");
	 Thread.sleep(2000);
	 driver.findElement(By.name("LastName")).sendKeys("Hake");
	 Thread.sleep(2000);
	 driver.findElement(By.id("Email")).sendKeys("vhake45@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.id("Password")).sendKeys("Vaibhav@14");
	 Thread.sleep(2000);
	 driver.findElement(By.id("ConfirmPassword")).sendKeys("Vaibhav@14");
	 Thread.sleep(2000);
	 driver.findElement(By.id("register-button")).click();
	 
	 driver.findElement(By.className("ico-login")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("Email")).sendKeys("vhake45@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.id("Password")).sendKeys("Vaibhav@14");
	 Thread.sleep(2000);
	 driver.findElement(By.className("button-1 login-button")).click();
	 
	 
	 driver.close();
     
}
}
