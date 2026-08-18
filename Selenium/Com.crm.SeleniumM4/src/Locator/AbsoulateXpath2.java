package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoulateXpath2 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div/div/input")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Vaibhav");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("Hake");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("vhake45@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div/input")).sendKeys("Vaibhav@14");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("Vaibhav@14");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
	 
	 driver.close();
}
}
