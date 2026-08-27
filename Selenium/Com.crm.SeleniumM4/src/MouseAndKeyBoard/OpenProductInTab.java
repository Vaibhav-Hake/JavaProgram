package MouseAndKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenProductInTab {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
    d.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
	Actions act=new Actions(d);
	
	WebElement books = d.findElement(By.xpath("//*[contains(text(),'Books')]"));
	act.keyDown(Keys.CONTROL).perform();
	Thread.sleep(2000);
	act.keyUp(Keys.CONTROL).perform();
	Thread.sleep(2000);
	
	act.keyDown(Keys.SHIFT).click(books).perform();
}
}
