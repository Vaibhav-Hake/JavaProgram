package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethode {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	ChromeDriver driver=new ChromeDriver();
	//Maximize
	driver.manage().window().maximize();
	//Enter into and perform navigation methode
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.navigate().to("https://www.youtube.com");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	
	driver.close();
	
	
}
}
