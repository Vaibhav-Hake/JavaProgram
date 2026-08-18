package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentIndirectLocator3 {
public static void main(String[] args) throws InterruptedException {
	 ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div/div/div[2]/ul/li/a")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div/div/div[2]/ul/li[2]/a")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div/div/div[2]/ul/li[3]/a")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div/div/div[2]/ul/li[4]/a")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div/div/div[2]/ul/li[5]/a")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div/div/div[2]/ul/li[6]/a")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div/div/div[2]/ul/li[7]/a")).click();
		 Thread.sleep(1000);
		 driver.close();
		 
}

}
