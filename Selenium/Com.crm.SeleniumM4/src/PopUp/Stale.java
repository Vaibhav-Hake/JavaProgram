package PopUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Stale {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	d.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	Thread.sleep(2000);
	WebElement sort = d.findElement(By.xpath("//select[@name='products-orderby']"));
	Select s=new Select(sort);
	int i=0;
	List<WebElement> op = s.getOptions();
	for (WebElement webElement : op) {
		sort = d.findElement(By.xpath("//select[@name='products-orderby']"));
		s=new Select(sort);
		s.selectByIndex(i++);
		Thread.sleep(1000);
	}
}
}
