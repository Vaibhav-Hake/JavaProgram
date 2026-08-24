package MouseAndKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
    d.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
	Actions act=new Actions(d);
//	//Using Acess
//	//act.scrollByAmount(0, 800);
//	//Scroll Down using element
//	WebElement facebook = d.findElement(By.xpath("//a[text()='Facebook']"));
//	Thread.sleep(2000);
//	act.scrollToElement(facebook).perform();
//	//d.findElement(By.xpath("//a[text()='Facebook']")).click();
//	
//	//Scroll up using element
//		WebElement excelent = d.findElement(By.id("pollanswers-1"));
//		Thread.sleep(2000);
//		act.scrollToElement(excelent).perform();
	
	//Scrolling using KeyBoard 
	act.keyDown(Keys.PAGE_DOWN).perform();
	// if want to keys release then we use keysUp
	act.keyUp(Keys.PAGE_DOWN).perform();
	Thread.sleep(2000);
	act.keyDown(Keys.PAGE_UP).perform();
	Thread.sleep(2000);
	d.quit();
}
}
