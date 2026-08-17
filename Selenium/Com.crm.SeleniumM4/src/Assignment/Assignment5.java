package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.rolls-roycemotorcars.com/en_GB/home.html");
	Thread.sleep(5000);
	driver.quit();
}
}
