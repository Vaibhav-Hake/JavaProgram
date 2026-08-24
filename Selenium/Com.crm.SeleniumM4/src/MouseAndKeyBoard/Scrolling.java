package MouseAndKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
    d.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
	Actions act=new Actions(d);
	act.scrollByAmount(0, 800);
	Thread.sleep(2000);
	d.findElement(By.xpath("//a[text()='Facebook']")).click();
	Thread.sleep(2000);
	d.quit();
}
}
