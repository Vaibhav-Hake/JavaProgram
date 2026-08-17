package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.bmw.in/en/index.html");
	Thread.sleep(5000);
	driver.quit();
}
}
