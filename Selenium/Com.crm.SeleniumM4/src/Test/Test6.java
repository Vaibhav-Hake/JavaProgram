package Test;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.lang.model.element.NestingKind;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class Test6 {
	

		public static void main(String[] args) throws InterruptedException {
			
			String f_urlString="https://www.facebook.com/nopCommerce";
			String t_urlString="https://twitter.com/nopCommerce";
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(" https://demowebshop.tricentis.com/");
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.id("Email")).sendKeys("prachisaste12@gmail.com");
	        driver.findElement(By.id("Password")).sendKeys("Prachi29");
	        driver.findElement(By.id("RememberMe")).click();
	        driver.findElement(By.className("login-button")).click();
			Thread.sleep(1000);
			String dws_url=driver.getWindowHandle();
			System.out.println("dws handle"+dws_url);
			Actions action=new Actions(driver);
			action.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
			Thread.sleep(1000);
			List<WebElement> ecommerse_link = driver.findElements(By.xpath("//a[@target='_blank']"));
			for (WebElement webElement : ecommerse_link) {
				webElement.click();
				Thread.sleep(1000);
				
			}
			Set<String> all_handle = driver.getWindowHandles();
			System.out.println(all_handle);
			for (String string : all_handle) {
				driver.switchTo().window(string);
				String ac_urlString=driver.getCurrentUrl();
				//click on create acc in facebook
				 if (f_urlString.equals(ac_urlString)) {
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[text()='Create new account']")).click();
					Thread.sleep(2000);
				}
				 else if (t_urlString.equals(ac_urlString)) {
						Thread.sleep(1000);
						driver.findElement(By.xpath("//a[text()='Sign up']")).click();
						Thread.sleep(2000);
					}
				
			}
			
			

			Set<String> allWindows = driver.getWindowHandles();

			for (String window : allWindows) {

			    if (!window.equals(dws_url)) {
			        driver.switchTo().window(window);
			        driver.close();   // close child window
			    }
			}

		
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
			Thread.sleep(2000);
			driver.quit();
			
			
		}

	}
