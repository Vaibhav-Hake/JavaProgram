package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
    d.get("https://omayo.blogspot.com/");
	
	Thread.sleep(2000);
	
	WebElement btn = d.findElement(By.id("but1"));
	System.out.println("Element is displayed  : "+btn.isDisplayed() );
	Thread.sleep(2000);
	System.out.println("Element is enabled  : "+btn.isEnabled() );
	Thread.sleep(2000);
	
	WebElement male=d.findElement(By.id("radio1"));
	male.click();
	System.out.println("Element is selected  : "+male.isSelected() );
	Thread.sleep(2000);
	

	WebElement female=d.findElement(By.id("radio2"));
	System.out.println("Element is selected  : "+female.isSelected() );
	Thread.sleep(2000);
	
	d.quit();
	
	
}
}
