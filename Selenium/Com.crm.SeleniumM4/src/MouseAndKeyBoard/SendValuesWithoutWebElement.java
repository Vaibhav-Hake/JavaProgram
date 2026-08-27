package MouseAndKeyBoard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendValuesWithoutWebElement {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
    d.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
	Actions act=new Actions(d);
	
	act.keyDown(Keys.TAB).perform();
	Thread.sleep(1000);
	act.keyDown(Keys.TAB).perform();
	Thread.sleep(1000);
	act.keyDown(Keys.TAB).perform();
	Thread.sleep(1000);
	act.keyDown(Keys.TAB).perform();
	Thread.sleep(1000);
	act.keyDown(Keys.TAB).perform();
	Thread.sleep(1000);
	act.keyDown(Keys.TAB).perform();
	Thread.sleep(1000);
	act.sendKeys("Computer").perform();
}
}
