package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
public static void main(String[] args) throws InterruptedException  {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	d.findElement(By.cssSelector(".search-box-button")).click();
	Thread.sleep(2000);
	Alert alt = d.switchTo().alert();
	String altText = alt.getText();
	System.out.println(altText);
	alt.accept();
	Thread.sleep(2000);
	d.quit();
}
}
