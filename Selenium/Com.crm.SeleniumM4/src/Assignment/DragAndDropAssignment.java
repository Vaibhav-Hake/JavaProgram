package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text() = 'UI Testing Concepts']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text() = 'Mouse Actions']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text() = 'Drag & Drop']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text() = 'Drag Position']")).click();
		Thread.sleep(2000);
		
		WebElement mobileCharger = driver.findElement(By.xpath("//div[text() = 'Mobile Charger']"));
		WebElement target1 = driver.findElement(By.xpath("//div[contains(@class,'drop-column')]"));
		
		WebElement laptopCharger = driver.findElement(By.xpath("//div[text() = 'Laptop Charger']"));
		WebElement target2 = driver.findElement(By.xpath("//div[contains(@class,'drop-column')][2]"));
		
		WebElement mobileCover = driver.findElement(By.xpath("//div[text() = 'Mobile Cover']"));
		WebElement target3 = driver.findElement(By.xpath("//div[contains(@class,'drop-column')]"));
		
		WebElement laptopCover = driver.findElement(By.xpath("//div[text() = 'Laptop Cover']"));
		WebElement target4 = driver.findElement(By.xpath("//div[contains(@class,'drop-column')][2]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(mobileCharger,target1 ).perform();
		Thread.sleep(2000);
		act.dragAndDrop(laptopCharger,target2 ).perform();
		Thread.sleep(2000);
		act.dragAndDrop(mobileCover,target3 ).perform();
		Thread.sleep(2000);
		act.dragAndDrop(laptopCover,target4 ).perform();
		Thread.sleep(2000);
		
		driver.close();
	}

}