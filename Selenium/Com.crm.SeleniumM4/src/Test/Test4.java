package Test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("prachisaste12@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Prachi29");
        driver.findElement(By.id("RememberMe")).click();
        driver.findElement(By.className("login-button")).click();
        Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		WebElement dg = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
		act.keyDown(Keys.SHIFT).click(dg).perform();
		act.keyUp(Keys.SHIFT).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		int count = driver.findElements(
			    By.xpath("//input[@value='Add to cart']")
			).size();

			for (int i = 0; i < count; i++) {

			    List<WebElement> add = driver.findElements(
			        By.xpath("//input[@value='Add to cart']")
			    );

			    add.get(0).click();

			    Thread.sleep(2000);
			}
		
	}

}