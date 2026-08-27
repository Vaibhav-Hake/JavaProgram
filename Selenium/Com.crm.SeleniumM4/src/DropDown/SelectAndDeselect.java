package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
    d.get("file:///D:/JavaPremium/TestingFile/demo-1%20(1).html");
	
	Thread.sleep(2000);
	//Single Select
	WebElement single = d.findElement(By.id("standard_cars"));
	Select sell1=new Select(single);
	sell1.selectByVisibleText("BMW");
	Thread.sleep(2000);
	sell1.selectByValue("lr");
	Thread.sleep(2000);
	sell1.selectByIndex(5);
	Thread.sleep(2000);
	//Multiple select
	WebElement mul = d.findElement(By.id("multiple_cars"));
	Select sell2=new Select(mul);
	sell2.selectByVisibleText("BMW");
	Thread.sleep(2000);
	sell2.selectByValue("lr");
	Thread.sleep(2000);
	sell2.selectByIndex(5);
	Thread.sleep(2000);
	
}
}
