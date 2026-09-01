package PopUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {
public static void main(String[] args) throws InterruptedException {
	String exp_url="https://www.youtube.com/user/nopCommerce";
	String fburl="https://www.facebook.com/nopCommerce";
	String twit="https://x.com/nopCommerce";
	String g="https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";
	ChromeDriver driver=new ChromeDriver();
	//Maximize
	driver.manage().window().maximize();
	//Enter into and perform navigation methode
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	String dws_handle = driver.getWindowHandle();
	System.out.println("dws_handle : "+dws_handle);
	Actions act=new Actions(driver);
	act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
	Thread.sleep(1000);
	
	List<WebElement> ecomerse_link = driver.findElements(By.xpath("//a[@target='_blank']"));
	for (WebElement link : ecomerse_link) {
		link.click();
		Thread.sleep(1000);
	}
	 Set<String> all_handle = driver.getWindowHandles();
	 System.out.println(all_handle);
	 for (String handle : all_handle) {
		 driver.switchTo().window(handle);
		 String act_url=driver.getCurrentUrl();
		 if(exp_url.equals(act_url)) {
			 Thread.sleep(1000);
			 driver.findElement(By.name("search_query")).sendKeys("carry Minati");
		
		 }
		 else if(fburl.equals(act_url)) {
			 Thread.sleep(1000);
		 driver.findElement(By.id("_r_4_")).sendKeys("9970029150");	
		 Thread.sleep(1000);
		 driver.findElement(By.id("_r_8_")).sendKeys("Vaibhav@14");
		 }
//         else if(twit.equals(act_url)) {
//			 
//		 }
        else if(g.equals(act_url)) {
        	 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("carry Minati");
		
		 }
		 Thread.sleep(2000);
		
	}
	 Thread.sleep(3000);
	 driver.quit();
	
}
}
