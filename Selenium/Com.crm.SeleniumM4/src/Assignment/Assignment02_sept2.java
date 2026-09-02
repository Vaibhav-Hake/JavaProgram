package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment02_sept2 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.naukri.com/");
    Thread.sleep(2000);
    d.findElement(By.xpath("//a[@title='Jobseeker Register']")).click();
    Thread.sleep(2000);
    d.findElement(By.cssSelector("#name")).sendKeys("Vaibhav Hake");
    
    Thread.sleep(2000);
    d.findElement(By.cssSelector("#email")).sendKeys("Vhake45@gmail.com");
    
    Thread.sleep(2000);
    d.findElement(By.cssSelector("#password")).sendKeys("V1234");
    
    Actions act=new Actions(d);
    act.keyDown(Keys.PAGE_DOWN).perform();
	Thread.sleep(2000);
    
    Thread.sleep(2000);
    d.findElement(By.cssSelector("#mobile")).sendKeys("9970029150");
    
    Thread.sleep(2000);
    d.findElement(By.cssSelector(".main-2")).click();
    
   
    Thread.sleep(2000);
    d.findElement(By.cssSelector("input[type=\"file\"]")).sendKeys("D:\\Vaibhav-Hake.pdf");
    
    Thread.sleep(5000);
    d.findElement(By.cssSelector(".chk-label")).click();
    
    Thread.sleep(3000);
    d.quit();
}
}
