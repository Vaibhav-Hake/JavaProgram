package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);

		
		WebElement doubleClick = driver.findElement(By.xpath("//button[text() = 'Double-Click Me To See Alert']"));
		act.doubleClick(doubleClick).perform();
		Thread.sleep(2000);

		driver.close();
	}

}