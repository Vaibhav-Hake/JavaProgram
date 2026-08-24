package MouseAndKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
    d.get("https://demo.automationtesting.in/Dynamic.html");
	
	Thread.sleep(2000);
	Actions act=new Actions(d);
	WebElement src = d.findElement(By.id("node"));
	WebElement target = d.findElement(By.id("droparea"));
	//act.dragAndDrop(src, target).perform();
	act.clickAndHold(src).release(target).perform();
}
}
