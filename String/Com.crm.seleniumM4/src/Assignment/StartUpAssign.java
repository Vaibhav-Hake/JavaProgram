package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpAssign {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.quit();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(5000);
		driver.quit();
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.suzukimotorcycle.co.in/");
		Thread.sleep(5000);
		driver.quit();
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.bmw.in/en/index.html");
		Thread.sleep(5000);
		driver.quit();
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.rolls-roycemotorcars.com/en_GB/home.html");
		Thread.sleep(5000);
		driver.quit();
	}
}
