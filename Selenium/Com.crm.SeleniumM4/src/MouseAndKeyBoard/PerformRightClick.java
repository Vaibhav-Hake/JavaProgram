package MouseAndKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformRightClick {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
    d.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	Thread.sleep(2000);
	Actions act=new Actions(d);
	
	WebElement rightClick = d.findElement(By.xpath("//span[text()='right click me']"));
	WebElement copy= d.findElement(By.xpath("//span[text()='copy']"));
	System.out.println("Before right Click : "+copy.isDisplayed());
	act.contextClick(rightClick).perform();
	System.out.println("After right Click : "+copy.isDisplayed());
	act.moveToElement(copy).perform();
	
}
}
