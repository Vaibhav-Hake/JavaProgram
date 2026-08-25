package MouseAndKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Register {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	Thread.sleep(2000);
	
	Actions act=new Actions(driver);
	
	WebElement name = driver.findElement(By.xpath("//div[@class='form-group']/div/input"));
	act.sendKeys(name,"vaibhav").perform();
	
	WebElement lastName = driver.findElement(By.xpath("//div[@class='form-group']/div[2]/input"));
	act.sendKeys(lastName,"Hake").perform();
}
}
