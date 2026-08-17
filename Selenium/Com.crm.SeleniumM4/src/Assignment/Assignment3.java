package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.suzukimotorcycle.co.in/");
	Thread.sleep(5000);
	driver.quit();
}
}
