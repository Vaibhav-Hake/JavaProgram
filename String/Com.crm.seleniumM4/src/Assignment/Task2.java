package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//Maximize
		driver.manage().window().maximize();
		//Enter into and perform navigation methode
		driver.get("https://www.redbus.in");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
