package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderPopUp {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demo.automationtesting.in/Datepicker.html");
	Thread.sleep(2000);
	WebElement en = d.findElement(By.xpath("//input[@id='datepicker2']"));
	//1st way
	//en.sendKeys("05/14/2004");
	//2nd way
	
	en.click();
	WebElement year = d.findElement(By.xpath("//select[@title='Change the year']"));
	Select sel_year=new Select(year);
	Thread.sleep(1000);
	sel_year.selectByVisibleText("2024");
	Thread.sleep(1000);
	
	WebElement month = d.findElement(By.xpath("//select[@title='Change the month']"));
	Select sel_month=new Select(month);
	Thread.sleep(1000);
	sel_month.selectByVisibleText("May");
	Thread.sleep(1000);
	
	d.findElement(By.xpath("//a[text()='14']")).click();
	
	
	
	Thread.sleep(3000);
	d.quit();
}
}
