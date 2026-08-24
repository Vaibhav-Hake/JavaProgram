package MouseAndKeyBoard;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
    d.get("https://www.myntra.com/");
	
	Thread.sleep(2000);
	
	Actions act=new Actions(d);
	WebElement baeuty = d.findElement(By.xpath("//a[text()='Beauty' and @data-group='beauty']"));
	act.moveToElement(baeuty).perform();
	WebElement shampoo = d.findElement(By.xpath("//a[text()='Shampoo']"));
	act.click(shampoo).perform();
	d.quit();
	
	
}
}
