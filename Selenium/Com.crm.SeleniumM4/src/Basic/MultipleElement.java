package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElement {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
    d.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
	//first way : common atrribute
//	List<WebElement> polls = d.findElements(By.name("pollanswers-1"));
//	for (WebElement poll : polls) {
//		poll.click();
//		Thread.sleep(2000);
//	}
	//2nd way: traversing common parent to child element
//	List<WebElement> polls = d.findElements(By.xpath("//ul[@class='poll-options']/li/input"));
//	for (WebElement poll : polls) {
//		poll.click();
//		Thread.sleep(2000);
//	}
	
	
//	List<WebElement> links = d.findElements(By.cssSelector("div[class='header-links']>ul>li>a"));
//	for (WebElement poll : links) {
//		poll.click();
//		Thread.sleep(1000);
//		d.navigate().back();
//	}
	
	List<WebElement> links = d.findElements(By.cssSelector("ul[class=\"top-menu\"]>li>a"));
	for (WebElement poll : links) {
		poll.click();
		Thread.sleep(1000);
		d.navigate().back();
	}
}
}
