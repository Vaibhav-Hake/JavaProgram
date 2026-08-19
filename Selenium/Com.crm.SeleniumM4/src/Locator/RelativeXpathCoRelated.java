package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathCoRelated {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	
	d.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	
	Thread.sleep(2000);
	
	d.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span"));
	d.close();
	
}
}
